package ac.za.cput.cuanlee.factories.impl;

import ac.za.cput.cuanlee.domain.RAM;
import ac.za.cput.cuanlee.factories.RAMFactory;

/**
 * Created by Cuan on 4/3/2016.
 */
public class RAMFactoryImpl implements RAMFactory{
    private static RAMFactoryImpl factory = null;

    private RAMFactoryImpl(){

    }

    public static RAMFactoryImpl getInstance(){
        if (factory == null)
            factory = new RAMFactoryImpl();

        return factory;
    }

    public RAM createRAM(Long id, String code, String description, String memorySize, double voltage, String memoryConfiguration, boolean active){
        RAM ram = new RAM.Builder()
                .id(id)
                .code(code)
                .description(description)
                .memorySize(memorySize)
                .voltage(voltage)
                .memoryConfiguration(memoryConfiguration)
                .active(active)
                .build();
        return ram;
    }
}
