package ac.za.cput.cuanlee.TestFactories;

import ac.za.cput.cuanlee.domain.CPU;
import ac.za.cput.cuanlee.domain.Processor_Brand;
import ac.za.cput.cuanlee.domain.RAM;
import ac.za.cput.cuanlee.factories.CPUFactory;
import ac.za.cput.cuanlee.factories.RAMFactory;
import ac.za.cput.cuanlee.factories.impl.CPUFactoryImpl;
import ac.za.cput.cuanlee.factories.impl.RAMFactoryImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Cuan on 4/3/2016.
 */
public class TestCPUFactory {
    private CPUFactory factory;

    @BeforeMethod
    public void setUp() throws Exception{
        factory = CPUFactoryImpl.getInstance();
    }

    @Test
    public void testCPUCreation()
    {
        CPU cpu = factory.createCPU(121232123L,"5351AA","Intel Skylake",1150, Processor_Brand.Intel,132323,123,8,true);
        Assert.assertEquals(true, cpu.isActive());
    }

    @Test
    public void testCPUCreationUpdate()
    {
        CPU cpu = factory.createCPU(121232123L, "5351AA", "Intel Skylake", 1150, Processor_Brand.Intel, 132323, 123, 8, true);
        Assert.assertEquals(true, cpu.isActive());

        CPU updateCpu = new CPU.Builder()
                .copy(cpu)
                .active(false)
                .build();

        Assert.assertEquals(false, updateCpu.isActive());
        Assert.assertEquals(8, updateCpu.getCores().intValue());
    }
}
