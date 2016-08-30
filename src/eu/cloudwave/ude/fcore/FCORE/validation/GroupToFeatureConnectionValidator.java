/**
 *
 * $Id$
 */
package eu.cloudwave.ude.fcore.FCORE.validation;

import eu.cloudwave.ude.fcore.FCORE.FeatureGroup;
import eu.cloudwave.ude.fcore.FCORE.GroupFeature;

/**
 * A sample validator interface for {@link eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GroupToFeatureConnectionValidator {
    boolean validate();

    boolean validateSource(FeatureGroup value);
    boolean validateTarget(GroupFeature value);
}