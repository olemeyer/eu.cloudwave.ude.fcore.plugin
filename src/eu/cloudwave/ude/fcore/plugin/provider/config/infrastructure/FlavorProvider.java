package eu.cloudwave.ude.fcore.plugin.provider.config.infrastructure;

import eu.cloudwave.ude.fcore.plugin.model.Flavor;

public interface FlavorProvider {
	Flavor getFlavor(String name);
}
