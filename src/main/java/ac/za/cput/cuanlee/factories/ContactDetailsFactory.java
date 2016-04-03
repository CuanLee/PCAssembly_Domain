package ac.za.cput.cuanlee.factories;

import ac.za.cput.cuanlee.domain.ContactDetails;

/**
 * Created by Cuan on 4/3/2016.
 */
public interface ContactDetailsFactory {
    ContactDetails createContactDetails(String telephone, String email);
}
