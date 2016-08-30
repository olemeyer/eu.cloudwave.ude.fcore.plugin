package eu.cloudwave.ude.fcore.adaptationvalidation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
//import org.eclipse.graphiti.mm.MmPackage;

import eu.cloudwave.ude.fcore.FCORE.Attribute;
import eu.cloudwave.ude.fcore.FCORE.FCOREFactory;
import eu.cloudwave.ude.fcore.FCORE.FCOREPackage;
import eu.cloudwave.ude.fcore.FCORE.Feature;
import eu.cloudwave.ude.fcore.FCORE.FeatureModel;
import eu.cloudwave.ude.fcore.FCORE.Influence;
import eu.cloudwave.ude.fcore.FCORE.InfluenceAttribute;
import eu.cloudwave.ude.fcore.FCORE.InfluenceFeature;
import eu.cloudwave.ude.fcore.FCORE.RootFeature;
import eu.cloudwave.ude.fcore.FCORE.SingleFeatureConnection;
import eu.cloudwave.ude.fcore.FCORE.Softgoal;
import eu.cloudwave.ude.fcore.FCORE.SolitaryFeature;
import eu.cloudwave.ude.fcore.FCORE.impl.SingleFeatureConnectionImpl;

public class Util {

    /**
     * Writes a given {@link FeatureModel} to file
     * 
     * @param fm
     * @param file
     */
    public static void writeToFile(FeatureModel fm, String file) {
        // register file extension
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("fcore", new XMIResourceFactoryImpl());

        // create resource set
        ResourceSet resSet = new ResourceSetImpl();

        // create a resource
        Resource resource = resSet.createResource(URI.createURI(file));

        // add FeatureModel to resource
        resource.getContents().add(fm);

        // write resource to file
        try {
            resource.save(Collections.EMPTY_MAP);
            System.out.println("File" + file + " written");
        } catch (IOException e) {
            System.out.println("Problem occured while writing " + file);
            e.printStackTrace();
        }
    }

    public static Softgoal getSoftgoalWithName(List<Softgoal> list, String name) {
        for (Softgoal sg : list) {
            if (sg.getName().equals(name)) {
                return sg;
            }
        }

        return null;
    }

    public static List<InfluenceFeature> getInfluenceFeatureForSoftgoal(List<InfluenceFeature> list, Softgoal softgoal) {
        List<InfluenceFeature> relevant = new ArrayList<InfluenceFeature>();

        for (InfluenceFeature infl : list) {
            if (infl.getSoftgoal() == softgoal) {
                relevant.add(infl);
            }
        }

        return relevant;
    }

    public static List<InfluenceAttribute> getInfluenceAttributeForSoftgoal(List<InfluenceAttribute> list, Softgoal softgoal) {
        List<InfluenceAttribute> relevant = new ArrayList<InfluenceAttribute>();

        for (InfluenceAttribute infl : list) {
            if (infl.getSoftgoal() == softgoal) {
                relevant.add(infl);
            }
        }

        return relevant;
    }

    public static Feature getFeatureOfAttribute(List<EObject> list, Attribute attribute) {
        for (EObject obj : list) {
            if (obj instanceof Feature) {
                if (((Feature) obj).getAttributes().contains(attribute)) {
                    return (Feature) obj;
                }
            }
        }

        return null;
    }

    public static List<EObject> readFromFile(String file) {
        try {
            ResourceSet resourceSet = new ResourceSetImpl();

            // register UML
            Map packageRegistry = resourceSet.getPackageRegistry();
            //packageRegistry.put(MmPackage.eNS_URI, MmPackage.eINSTANCE);
            packageRegistry.put(FCOREPackage.eNS_URI, FCOREPackage.eINSTANCE);

            // Register XML resource as UMLResource.Factory.Instance
            Map extensionFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
            extensionFactoryMap.put("fcore", new XMIResourceFactoryImpl());

            Resource resource = (Resource) resourceSet.getResource(URI.createURI(file), true);

            // try to load the file into resource
            resource.load(null);

            // remove diagram
            resource.getContents().remove(0);

            return resource.getContents();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;

        //        
        //        // Initialize the model
        //        FCOREPackage.eINSTANCE.eClass();
        //        
        //
        //        // Register the XMI resource factory for the .fcore extension
        //        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        //        Map<String, Object> m = reg.getExtensionToFactoryMap();
        //        m.put("fcore", new XMIResourceFactoryImpl());
        //
        //        // Obtain a new resource set
        //        ResourceSet resSet = new ResourceSetImpl();
        //
        //        // Get the resource
        //        Resource resource = resSet.getResource(URI.createURI(file), true);
        //
        //        //return (FeatureModel) resource.getContents().get(0);
        //        return (FeatureModel) resource.getContents().get(0);
    }

    /**
     * Creates a new {@link FeatureModel} with a new {@link RootFeature} containing all RootFeatures of the given models converted to {@link SolitaryFeature}s
     * 
     * It is assumed that a RootNode has no FeatureConstraint or Influence.
     * 
     * When Softgoals are merged the "weighting" string will be lost.
     * 
     * @param models
     * @return
     */
    public static FeatureModel joinModels(List<FeatureModel> models, String name) {
        FCOREFactory f = FCOREFactory.eINSTANCE;
        FeatureModel fm = f.createFeatureModel();

        RootFeature root = f.createRootFeature(name);
        fm.setRootFeature(root);

        for (FeatureModel model : models) {
            RootFeature oldRoot = model.getRootFeature();

            // create new SolitaryFeature
            SolitaryFeature newFeature = f.createSolitaryFeature(oldRoot.getName(), 1, 1);

            // add all SolitaryFeatures (i.e. its children) of the old RootFeature to the new SolitaryFeature
            //newFeature.getSolitaryFeatures().addAll(oldRoot.getSolitaryFeatures());
            newFeature.getOutgoingSingleFeatureConnections().addAll(oldRoot.getOutgoingSingleFeatureConnections());

            // add all FeatureGroups from old to new
            //newFeature.getFeatureGroups().addAll(oldRoot.getFeatureGroups());
            newFeature.getFeatureToGroupConnections().addAll(oldRoot.getFeatureToGroupConnections());

            // add all AttributeConstraints from old to new
            newFeature.getAttributeConstraints().addAll(oldRoot.getAttributeConstraints());

            // add all Attributes from old to new
            newFeature.getAttributes().addAll(oldRoot.getAttributes());

            // add all FeatureConstraints from old to new
            //fm.getFeatureConstraints().addAll(model.getFeatureConstraints());
            fm.getRequiresFeatureConstraints().addAll(model.getRequiresFeatureConstraints());
            fm.getExcludesFeatureConstraints().addAll(model.getExcludesFeatureConstraints());

            // add the old RootFeature as mandatory SolitaryFeature to the new RootFeature
            //root.getSolitaryFeatures().add(newFeature);
            SingleFeatureConnection sfc = new SingleFeatureConnectionImpl() {
            };
            sfc.setSource(root);
            sfc.setTarget(newFeature);
            root.getOutgoingSingleFeatureConnections().add(sfc);

            // merge Softgoals
            HashMap<Influence, Softgoal> convertMap = new HashMap<Influence, Softgoal>();
            for (Softgoal sg : model.getSoftgoals()) {
                Softgoal sgFound = null;

                // check if Softgoal with the same name does already exist in new FeatureModel
                for (Softgoal sgNew : fm.getSoftgoals()) {
                    if (sgNew.getName().equals(sg.getName())) {
                        sgFound = sgNew;
                    }
                }

                if (sgFound == null) {
                    // Softgoal does not exist yet: create it
                    sgFound = f.createSoftgoal(sg.getName());
                    fm.getSoftgoals().add(sgFound);
                }

                for (Influence infl : sg.getInfluence()) {
                    // save for changing later and avoid concurrent modification exception
                    convertMap.put(infl, sgFound);
                }
            }

            for (Influence infl : convertMap.keySet()) {
                infl.setSoftgoal(convertMap.get(infl));
            }
        }

        return fm;
    }

}
