/**
 *
 * $Id$
 */
package eu.cloudwave.ude.fcore.FCORE.validation;

import eu.cloudwave.ude.fcore.FCORE.FeatureToGroupConnection;
import eu.cloudwave.ude.fcore.FCORE.GroupFeature;

import eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection;
import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link eu.cloudwave.ude.fcore.FCORE.FeatureGroup}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FeatureGroupValidator {
    boolean validate();

    boolean validateMin(int value);
    boolean validateMax(int value);
    boolean validateFeatureToGroupConnection(FeatureToGroupConnection value);

    boolean validateGroupToFeatureConnections(EList<GroupToFeatureConnection> value);

    boolean validateGroupFeatures(EList<GroupFeature> value);
}