package ac.za.cput.cuanlee.TestFactories;

import ac.za.cput.cuanlee.domain.GPU;
import ac.za.cput.cuanlee.domain.RAM;
import ac.za.cput.cuanlee.factories.GPUFactory;
import ac.za.cput.cuanlee.factories.RAMFactory;
import ac.za.cput.cuanlee.factories.impl.GPUFactoryImpl;
import ac.za.cput.cuanlee.factories.impl.RAMFactoryImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Cuan on 4/3/2016.
 */
public class TestGPUFactory {
    private GPUFactory factory;

    @BeforeMethod
    public void setUp() throws Exception{
        factory = GPUFactoryImpl.getInstance();
    }

    @Test
    public void testGPUCreation()
    {
        GPU gpu = factory.createGPU(1231321L, "gpuCode", "gpuDescription", 132, 121, "GDDR5", 132123, "PCIE3", false);
        Assert.assertEquals("GDDR5", gpu.getMemoryType());
    }

    @Test
    public void testGPUCreationUpdate()
    {
        GPU gpu = factory.createGPU(1231321L, "gpuCode", "gpuDescription", 132, 121, "GDDR5", 132123, "PCIE3", false);
        Assert.assertEquals("GDDR5", gpu.getMemoryType());

        GPU upodateGPU = new GPU.Builder()
                .copy(gpu)
                .description("Nvidia")
                .build();

        Assert.assertEquals("Nvidia", upodateGPU.getDescription());
        Assert.assertEquals("gpuCode", upodateGPU.getCode());
    }
}
