package ac.za.cput.cuanlee.factories.impl;

import ac.za.cput.cuanlee.domain.Computer;
import ac.za.cput.cuanlee.domain.FormFactor;
import ac.za.cput.cuanlee.domain.Motherboard;
import ac.za.cput.cuanlee.factories.ComputerFactory;

/**
 * Created by Cuan on 4/3/2016.
 */
public class ComputerFactoryImpl implements ComputerFactory {
    private static ComputerFactoryImpl factory = null;

    private ComputerFactoryImpl(){

    }

    public static ComputerFactoryImpl getInstance(){
        if (factory == null)
            factory = new ComputerFactoryImpl();

        return factory;
    }

    public Computer createComputer(Long id, String code, String description, Motherboard motherboard, boolean active, Integer hddBays, Integer caseFans, FormFactor formFactor){
        Computer computer = new Computer.Builder()
                .id(id)
                .code(code)
                .description(description)
                .motherboard(motherboard)
                .hddBays(hddBays)
                .caseFans(caseFans)
                .formFactor(formFactor)
                .active(active)
                .build();
        return computer;
    }
}
