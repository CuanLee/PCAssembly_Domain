package ac.za.cput.cuanlee.TestFactories;

import ac.za.cput.cuanlee.domain.PSU;
import ac.za.cput.cuanlee.domain.RAM;
import ac.za.cput.cuanlee.factories.PSUFactory;
import ac.za.cput.cuanlee.factories.RAMFactory;
import ac.za.cput.cuanlee.factories.impl.PSUFactoryImpl;
import ac.za.cput.cuanlee.factories.impl.RAMFactoryImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Cuan on 4/3/2016.
 */
public class TestPSUFactory {
    private PSUFactory factory;

    @BeforeMethod
    public void setUp() throws Exception{
        factory = PSUFactoryImpl.getInstance();
    }

    @Test
    public void testPSUCreation()
    {
        PSU psu = factory.createPSU(1231321L, "11234", "Raidmax Gold Series", 750, 6, 4, 0, true);
        Assert.assertEquals("Raidmax Gold Series", psu.getDescription());
    }

    @Test
    public void testPSUCreationUpdate()
    {
        PSU psu = factory.createPSU(1231321L, "11234", "Raidmax Gold Series", 750, 6, 4, 0, true);
        Assert.assertEquals("Raidmax Gold Series", psu.getDescription());

        PSU updatePSU = new PSU.Builder()
                .copy(psu)
                .id(111111L)
                .four_pin_molex(7)
                .build();

        Assert.assertEquals(7, updatePSU.getFour_pin_molex().intValue());
        Assert.assertEquals(111111L, updatePSU.getId().longValue());
    }
}
