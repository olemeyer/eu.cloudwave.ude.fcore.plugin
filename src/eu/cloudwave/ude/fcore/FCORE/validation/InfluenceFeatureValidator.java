/**
 *
 * $Id$
 */
package eu.cloudwave.ude.fcore.FCORE.validation;

import eu.cloudwave.ude.fcore.FCORE.Feature;

/**
 * A sample validator interface for {@link eu.cloudwave.ude.fcore.FCORE.InfluenceFeature}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InfluenceFeatureValidator {
    boolean validate();

    boolean validateFeature(Feature value);
}
