package ac.za.cput.cuanlee.factories;

import ac.za.cput.cuanlee.domain.CPU;
import ac.za.cput.cuanlee.domain.Processor_Brand;

/**
 * Created by Cuan on 4/3/2016.
 */
public interface CPUFactory {
    CPU createCPU(Long id, String code, String description, Integer socket, Processor_Brand processorBrand, double speed_Ghz, double cache_MB, Integer cores, boolean active);
}
