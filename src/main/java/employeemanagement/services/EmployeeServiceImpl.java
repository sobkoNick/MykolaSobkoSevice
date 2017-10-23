package employeemanagement.services;

import employeemanagement.domain.Employee;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 */

@WebService
public class EmployeeServiceImpl implements EmployeeService {
    @WebMethod
    public Employee getEmployeeByID(String id) {
        return new Employee("1", "Jose Mourinho");
    }
}
