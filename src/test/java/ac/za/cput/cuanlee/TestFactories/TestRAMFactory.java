package ac.za.cput.cuanlee.TestFactories;

import ac.za.cput.cuanlee.domain.RAM;
import ac.za.cput.cuanlee.factories.RAMFactory;
import ac.za.cput.cuanlee.factories.impl.RAMFactoryImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Cuan on 4/3/2016.
 */
public class TestRAMFactory {
    private RAMFactory factory;

    @BeforeMethod
    public void setUp() throws Exception{
        factory = RAMFactoryImpl.getInstance();
    }

    @Test
    public void testRAMCreation()
    {
        RAM ram = factory.createRAM(1231321L,"vengance","corsair vengance ram","4GB",400,"Dula Module",true);
        Assert.assertEquals(true, ram.isActive());
    }

    @Test
    public void testRAMCreationUpdate()
    {
        RAM ram = factory.createRAM(1231321L,"vengance","corsair vengance ram","4GB",400,"Dula Module",true);
        Assert.assertEquals(true, ram.isActive());

        RAM updateRAM = new RAM.Builder()
                .copy(ram)
                .active(false)
                .build();

        Assert.assertEquals(false, updateRAM.isActive());
        Assert.assertEquals("vengance", updateRAM.getCode());
    }
}
