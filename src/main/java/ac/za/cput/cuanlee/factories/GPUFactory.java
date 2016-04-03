package ac.za.cput.cuanlee.factories;

import ac.za.cput.cuanlee.domain.GPU;

/**
 * Created by Cuan on 4/3/2016.
 */
public interface GPUFactory {
    GPU createGPU(Long id, String code, String description, Integer bitMemory, Integer memorySize_GB, String memoryType, double memoryClock_MHz, String cardBus, boolean active);
}
