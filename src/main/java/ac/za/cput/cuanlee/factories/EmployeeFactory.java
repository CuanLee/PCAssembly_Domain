package ac.za.cput.cuanlee.factories;

import ac.za.cput.cuanlee.domain.*;

import java.util.List;

/**
 * Created by Cuan on 4/3/2016.
 */
public interface EmployeeFactory {
    Employee createEmployee(Long id, String username, String password, String firstName, String lastName, Gender gender, ContactDetails contactDetails, GeographicalDetails geographicalDetails, String idNumber, List<Computer> computerList);
}
