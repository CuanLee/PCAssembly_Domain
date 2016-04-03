package ac.za.cput.cuanlee.TestFactories;

import ac.za.cput.cuanlee.domain.HDD;
import ac.za.cput.cuanlee.domain.RAM;
import ac.za.cput.cuanlee.factories.HDDFactory;
import ac.za.cput.cuanlee.factories.RAMFactory;
import ac.za.cput.cuanlee.factories.impl.HDDFactoryImpl;
import ac.za.cput.cuanlee.factories.impl.RAMFactoryImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Cuan on 4/3/2016.
 */
public class TestHDDFactory {
    private HDDFactory factory;

    @BeforeMethod
    public void setUp() throws Exception{
        factory = HDDFactoryImpl.getInstance();
    }

    @Test
    public void testPSUCreation()
    {
        HDD hdd = factory.createHDD(564546L, "testCode","testDesc",1232,2331,true,false);
        Assert.assertEquals("testCode", hdd.getCode());
    }

    @Test
    public void testPSUCreationUpdate()
    {
        HDD hdd = factory.createHDD(564546L, "testCode", "testDesc", 1232, 2331, true, false);
        Assert.assertEquals("testCode", hdd.getCode());

        HDD updateHDD = new HDD.Builder()
                .copy(hdd)
                .active(true)
                .code("UpdateTestCode")
                .build();

        Assert.assertEquals(true, updateHDD.isActive());
        Assert.assertEquals("UpdateTestCode", updateHDD.getCode());
    }
}
