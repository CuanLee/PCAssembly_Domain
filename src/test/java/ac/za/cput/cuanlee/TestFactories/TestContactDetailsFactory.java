package ac.za.cput.cuanlee.TestFactories;

import ac.za.cput.cuanlee.domain.ContactDetails;
import ac.za.cput.cuanlee.domain.RAM;
import ac.za.cput.cuanlee.factories.ContactDetailsFactory;
import ac.za.cput.cuanlee.factories.RAMFactory;
import ac.za.cput.cuanlee.factories.impl.ContactDetailsFactoryImpl;
import ac.za.cput.cuanlee.factories.impl.RAMFactoryImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Cuan on 4/3/2016.
 */
public class TestContactDetailsFactory {
    private ContactDetailsFactory factory;

    @BeforeMethod
    public void setUp() throws Exception{
        factory = ContactDetailsFactoryImpl.getInstance();
    }

    @Test
    public void testContactCreation()
    {
        ContactDetails contactDetails = factory.createContactDetails("021312123","cuan@g.com");
        Assert.assertEquals("cuan@g.com", contactDetails.getEmail());
    }

    @Test
    public void testContactCreationUpdate()
    {
        ContactDetails contactDetails = factory.createContactDetails("021312123", "cuan@g.com");
        Assert.assertEquals("cuan@g.com", contactDetails.getEmail());

        ContactDetails updateContact = new ContactDetails.Builder()
                .copy(contactDetails)
                .email("bbbb")
                .build();

        Assert.assertEquals("bbbb", updateContact.getEmail());
        Assert.assertEquals("021312123", updateContact.getTelephone());
    }
}
