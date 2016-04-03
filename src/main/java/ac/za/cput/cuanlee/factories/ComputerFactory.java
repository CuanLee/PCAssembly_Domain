package ac.za.cput.cuanlee.factories;

import ac.za.cput.cuanlee.domain.Computer;
import ac.za.cput.cuanlee.domain.FormFactor;
import ac.za.cput.cuanlee.domain.Motherboard;

/**
 * Created by Cuan on 4/3/2016.
 */
public interface ComputerFactory {
    Computer createComputer(Long id, String code, String description, Motherboard motherboard, boolean active, Integer hddBays, Integer caseFans, FormFactor formFactor);
}
