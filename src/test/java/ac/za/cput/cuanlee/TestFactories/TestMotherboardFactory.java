package ac.za.cput.cuanlee.TestFactories;

import ac.za.cput.cuanlee.domain.FormFactor;
import ac.za.cput.cuanlee.domain.Motherboard;
import ac.za.cput.cuanlee.domain.RAM;
import ac.za.cput.cuanlee.factories.MotherboardFactory;
import ac.za.cput.cuanlee.factories.RAMFactory;
import ac.za.cput.cuanlee.factories.impl.MotherboardFactoryImpl;
import ac.za.cput.cuanlee.factories.impl.RAMFactoryImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Cuan on 4/3/2016.
 */
public class TestMotherboardFactory {
    private MotherboardFactory factory;

    @BeforeMethod
    public void setUp() throws Exception{
        factory = MotherboardFactoryImpl.getInstance();
    }

    @Test
    public void testMOBOreation()
    {
        Motherboard motherboard = factory.createMotherboard(2104654L,"Asus B85m", "Asus Golden Series",null,"1150",null,2133,null,null,4,2,null, FormFactor.ATX,true);
        Assert.assertEquals(true, motherboard.isActive());
        Assert.assertEquals("Asus B85m", motherboard.getCode());
    }

    @Test
    public void testMOBOCreationUpdate()
    {
        Motherboard motherboard = factory.createMotherboard(2104654L, "Asus B85m", "Asus Golden Series", null, "1150", null, 2133, null, null, 4, 2, null, FormFactor.ATX, true);
        Assert.assertEquals(true, motherboard.isActive());
        Assert.assertEquals("Asus B85m", motherboard.getCode());

        Motherboard updateMobo = new Motherboard.Builder()
                .copy(motherboard)
                .active(false)
                .code("Asus b777")
                .build();

        Assert.assertEquals(false, updateMobo.isActive());
        Assert.assertEquals("Asus b777", updateMobo.getCode());
        Assert.assertEquals("Asus Golden Series", updateMobo.getDescription());
    }

}
