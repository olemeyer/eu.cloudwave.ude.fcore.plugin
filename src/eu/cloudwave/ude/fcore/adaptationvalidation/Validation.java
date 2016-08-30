package eu.cloudwave.ude.fcore.adaptationvalidation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import eu.cloudwave.ude.fcore.FCORE.Attribute;
import eu.cloudwave.ude.fcore.FCORE.Feature;
import eu.cloudwave.ude.fcore.FCORE.Influence;
import eu.cloudwave.ude.fcore.FCORE.InfluenceAttribute;
import eu.cloudwave.ude.fcore.FCORE.InfluenceFeature;
import eu.cloudwave.ude.fcore.FCORE.Softgoal;

public class Validation {

    public static void main(String[] args) {
        List<EObject> fm1 = Util.readFromFile("testfiles/test1.fcore");
        List<EObject> fm2 = Util.readFromFile("testfiles/test2.fcore");
        System.out.println("Mean Softgoal Value: " + Validation.getSoftgoalValue(fm1, fm2));
    }

    public static float getSoftgoalValue(List<EObject> fm1, List<EObject> fm2) {
        // merge lists
        List<EObject> merge = new ArrayList<EObject>();
        merge.addAll(fm1);
        merge.addAll(fm2);

        List<Softgoal> sgs = new ArrayList<Softgoal>();
        List<InfluenceFeature> finfl = new ArrayList<InfluenceFeature>();
        List<InfluenceAttribute> ainfl = new ArrayList<InfluenceAttribute>();

        for (EObject elem : merge) {
            System.out.println("- " + elem);

            if ((elem instanceof InfluenceFeature) || (elem instanceof InfluenceAttribute)) {
                // access feature/softgoal/contribution
                Softgoal sgInfl = ((Influence) elem).getSoftgoal();
                Softgoal sgFound = Util.getSoftgoalWithName(sgs, sgInfl.getName());
                if (sgFound == null) {
                    sgs.add(sgInfl);
                } else {
                    // replace Softgoal with the one already in the list
                    ((Influence) elem).setSoftgoal(sgFound);
                }

                if (elem instanceof InfluenceFeature) {
                    finfl.add((InfluenceFeature) elem);
                } else if (elem instanceof InfluenceAttribute) {
                    ainfl.add((InfluenceAttribute) elem);
                }
            }
        }

        // map for saving calculated softgoal values
        Map<String, Float> sgNameValueMap = new HashMap<String, Float>();

        // calculate softgoal values
        for (Softgoal sg : sgs) {
            float sgVal = 0;
            float nominator = 0;

            List<InfluenceFeature> inflF = Util.getInfluenceFeatureForSoftgoal(finfl, sg);
            List<InfluenceAttribute> inflA = Util.getInfluenceAttributeForSoftgoal(ainfl, sg);

            float denominator = inflF.size() + inflA.size();

            for (InfluenceFeature iff : inflF) {
                float cont = iff.getContribution();
                Feature feat = iff.getFeature();

                if (cont < 0) {
                    // negative influence (e.g. -0.8)
                    if (feat.isSelected()) {
                        // selected
                        nominator += (1 + cont); // e.g. add 0.2
                    } else {
                        // not selected
                        nominator += -cont; // e.g. add 0.8
                    }
                } else {
                    // positive influence (e.g. 0.8)
                    if (feat.isSelected()) {
                        // selected
                        nominator += cont; // e.g. add 0.8
                    } else {
                        // not selected
                        nominator += (1 - cont); // e.g. add 0.2
                    }
                }
            }

            for (InfluenceAttribute ifa : inflA) {
                float cont = ifa.getContribution();
                float contNorm = 0;
                Attribute attr = ifa.getAttribute();
                int val = attr.getValue();
                int min = attr.getMin();
                int max = attr.getMax();
                Feature attrFeat = Util.getFeatureOfAttribute(merge, attr);

                contNorm = new Float(val - min + 1) / new Float(max - min + 1);

                // normalize attribute value to the range 0.0..1.0 and calculate value for nominator
                if (cont < 0) {
                    // negative influence of attribute
                    // (e.g. -0.3 for an attribute ranging [2..5] and a value of 4)
                    // contNorm = (4 - 2 + 1) / (5 - 2 + 1) = 0.75 

                    if (attrFeat.isSelected()) {
                        // due to negative influence add only 1 - 0.75 = 0.25
                        // this allows for greater values (i.e. better for the softgoal) if the value of the negatively influencing attribute is very low 
                        nominator += (1 - contNorm); // 0.25
                    } else {
                        // a negative influence of an attribute is prevented because feature is not selected
                        nominator += 1;
                    }
                } else {
                    // positive influence of attribute
                    // (e.g. 0.6 for an attribute ranging [0..4] and a value of 1)
                    // contNorm = (1 - 0 + 1) / (4 - 0 + 1) = 0.4

                    if (attrFeat.isSelected()) {
                        // a positive influence of an attribute is added because the respective feature is selected
                        nominator += contNorm;
                    } else {
                        // a positive influence of an attribute was prevented because the respective feature was not selected
                        // therefore zero is added to the nominator
                    }
                }
            }

            sgVal = nominator / denominator;

            // save calculated softgoal value in map
            sgNameValueMap.put(sg.getName(), sgVal);
        }

        // add up all softgoal values and calculate mean
        float finalValue = 0;

        for (String key : sgNameValueMap.keySet()) {
            System.out.println(key + " = " + sgNameValueMap.get(key));
            finalValue += sgNameValueMap.get(key);
        }

        finalValue /= (float) sgNameValueMap.size();

        return finalValue;
    }
}
