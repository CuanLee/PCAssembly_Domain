package ac.za.cput.cuanlee.TestFactories;

import ac.za.cput.cuanlee.domain.Computer;
import ac.za.cput.cuanlee.domain.FormFactor;
import ac.za.cput.cuanlee.domain.Motherboard;
import ac.za.cput.cuanlee.domain.RAM;
import ac.za.cput.cuanlee.factories.ComputerFactory;
import ac.za.cput.cuanlee.factories.MotherboardFactory;
import ac.za.cput.cuanlee.factories.RAMFactory;
import ac.za.cput.cuanlee.factories.impl.ComputerFactoryImpl;
import ac.za.cput.cuanlee.factories.impl.MotherboardFactoryImpl;
import ac.za.cput.cuanlee.factories.impl.RAMFactoryImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Cuan on 4/3/2016.
 */
public class TestComputerFactory {
    private ComputerFactory factory;
    private MotherboardFactory mobofactory;

    @BeforeMethod
    public void setUp() throws Exception{
        factory = ComputerFactoryImpl.getInstance();
        mobofactory = MotherboardFactoryImpl.getInstance();
    }

    @Test
    public void testComputerCreation()
    {
        Motherboard motherboard = mobofactory.createMotherboard(2104654L,"Asus B85m", "Asus Golden Series",null,"1150",null,2133,null,null,4,2,null, FormFactor.ATX,true);
        Computer computer = factory.createComputer(56464L,"7501212","Monster Build",motherboard,true,6,4,FormFactor.ATX);
        Assert.assertEquals(true, computer.isActive());
        Assert.assertEquals(4, computer.getCaseFans().intValue());
    }

    @Test
    public void testComputerCreationUpdate()
    {
        Motherboard motherboard = mobofactory.createMotherboard(2104654L, "Asus B85m", "Asus Golden Series", null, "1150", null, 2133, null, null, 4, 2, null, FormFactor.ATX, true);
        Computer computer = factory.createComputer(56464L,"7501212","Monster Build",motherboard,true,6,4,FormFactor.ATX);
        Assert.assertEquals(true, computer.isActive());
        Assert.assertEquals(4, computer.getCaseFans().intValue());

        Computer updateComputer = new Computer.Builder()
                .copy(computer)
                .active(false)
                .hddBays(1)
                .build();

        Assert.assertEquals(false, updateComputer.isActive());
        Assert.assertEquals(1, updateComputer.getHddBays().intValue());
    }
}
