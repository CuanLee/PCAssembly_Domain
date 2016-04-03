package ac.za.cput.cuanlee.factories.impl;

import ac.za.cput.cuanlee.domain.*;
import ac.za.cput.cuanlee.factories.EmployeeFactory;

import java.util.List;

/**
 * Created by Cuan on 4/3/2016.
 */
public class EmployeeFactoryImpl implements EmployeeFactory {
    private static EmployeeFactoryImpl factory = null;

    private EmployeeFactoryImpl(){

    }

    public static EmployeeFactoryImpl getInstance(){
        if (factory == null)
            factory = new EmployeeFactoryImpl();

        return factory;
    }

    public Employee createEmployee(Long id, String username, String password, String firstName, String lastName, Gender gender, ContactDetails contactDetails, GeographicalDetails geographicalDetails, String idNumber, List<Computer> computerList){
        Employee employee = new Employee.Builder()
                .id(id)
                .username(username)
                .password(password)
                .firstName(firstName)
                .lastName(lastName)
                .gender(gender)
                .contactDetails(contactDetails)
                .geographicalDetails(geographicalDetails)
                .idNumber(idNumber)
                .computerList(computerList)
                .build();
        return employee;
    }

}
