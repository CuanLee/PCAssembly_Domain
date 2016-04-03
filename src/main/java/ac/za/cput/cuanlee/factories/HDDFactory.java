package ac.za.cput.cuanlee.factories;

import ac.za.cput.cuanlee.domain.HDD;

/**
 * Created by Cuan on 4/3/2016.
 */
public interface HDDFactory {
    HDD createHDD(Long id, String code, String description, double size_MB, double rpm, boolean sata, boolean active);
}
