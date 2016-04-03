package ac.za.cput.cuanlee.factories;

import ac.za.cput.cuanlee.domain.GeographicalDetails;

/**
 * Created by Cuan on 4/3/2016.
 */
public interface GeographicalDetailsFactory {
    GeographicalDetails createGeographicalDetails(String country, String province, String city, String suburb, String street, Integer houseNumber);
}
