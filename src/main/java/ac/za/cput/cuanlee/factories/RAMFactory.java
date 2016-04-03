package ac.za.cput.cuanlee.factories;

import ac.za.cput.cuanlee.domain.RAM;

/**
 * Created by Cuan on 4/3/2016.
 */
public interface RAMFactory {
    RAM createRAM(Long id, String code, String description, String memorySize, double voltage, String memoryConfiguration, boolean active);
}
