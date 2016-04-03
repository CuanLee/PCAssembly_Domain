package ac.za.cput.cuanlee.factories;

import ac.za.cput.cuanlee.domain.*;

import java.util.List;

/**
 * Created by Cuan on 4/3/2016.
 */
public interface MotherboardFactory {
    Motherboard createMotherboard(Long id, String code, String description, CPU cpu, String chipset, List<RAM> ramList, Integer sataPorts, List<HDD> hddList, PSU psu, Integer usb2, Integer usb3, List<GPU> gpuList, FormFactor formFactor, boolean active);
}
