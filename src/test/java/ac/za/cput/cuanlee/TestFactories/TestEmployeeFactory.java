package ac.za.cput.cuanlee.TestFactories;

import ac.za.cput.cuanlee.domain.Employee;
import ac.za.cput.cuanlee.domain.Gender;
import ac.za.cput.cuanlee.domain.RAM;
import ac.za.cput.cuanlee.factories.EmployeeFactory;
import ac.za.cput.cuanlee.factories.RAMFactory;
import ac.za.cput.cuanlee.factories.impl.EmployeeFactoryImpl;
import ac.za.cput.cuanlee.factories.impl.RAMFactoryImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Cuan on 4/3/2016.
 */
public class TestEmployeeFactory {
    private EmployeeFactory factory;

    @BeforeMethod
    public void setUp() throws Exception{
        factory = EmployeeFactoryImpl.getInstance();
    }

    @Test
    public void testEmployeeCreation()
    {
        Employee employee = factory.createEmployee(123131L,"cuanl26","1234567","Cuan","Lee", Gender.Male,null,null,"6546654564654",null);
        Assert.assertEquals("Cuan", employee.getFirstName());
    }

    @Test
    public void testEmployeeCreationUpdate()
    {
        Employee employee = factory.createEmployee(123131L, "cuanl26", "1234567", "Cuan", "Lee", Gender.Male, null, null, "6546654564654", null);
        Assert.assertEquals("Cuan", employee.getFirstName());

        Employee updateEmployee = new Employee.Builder()
                .copy(employee)
                .lastName("John")
                .build();

        Assert.assertEquals("John", updateEmployee.getLastName());
        Assert.assertEquals("6546654564654", updateEmployee.getIdNumber());
    }
}
