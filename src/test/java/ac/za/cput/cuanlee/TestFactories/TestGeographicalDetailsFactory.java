package ac.za.cput.cuanlee.TestFactories;

import ac.za.cput.cuanlee.domain.GeographicalDetails;
import ac.za.cput.cuanlee.domain.RAM;
import ac.za.cput.cuanlee.factories.GeographicalDetailsFactory;
import ac.za.cput.cuanlee.factories.RAMFactory;
import ac.za.cput.cuanlee.factories.impl.GeographicalDetailsFactoryImpl;
import ac.za.cput.cuanlee.factories.impl.RAMFactoryImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Cuan on 4/3/2016.
 */
public class TestGeographicalDetailsFactory {
    private GeographicalDetailsFactory factory;

    @BeforeMethod
    public void setUp() throws Exception{
        factory = GeographicalDetailsFactoryImpl.getInstance();
    }

    @Test
    public void testGeoCreation()
    {
        GeographicalDetails geographicalDetails = factory.createGeographicalDetails("SA", "WC", "Cape Town", "Brackenfell", "Long", 55);
        Assert.assertEquals("Long", geographicalDetails.getStreet());
    }

    @Test
    public void testGeoCreationUpdate()
    {
        GeographicalDetails geographicalDetails = factory.createGeographicalDetails("SA", "WC", "Cape Town", "Brackenfell", "Long", 55);
        Assert.assertEquals("Long", geographicalDetails.getStreet());

        GeographicalDetails updateGeo = new GeographicalDetails.Builder()
                .copy(geographicalDetails)
                .houseNumber(123)
                .build();

        Assert.assertEquals(123, updateGeo.getHouseNumber().intValue());
        Assert.assertEquals("Brackenfell", updateGeo.getSuburb());
    }
}
