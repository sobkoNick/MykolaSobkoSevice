package com.epam.lab.service.rest.employee;


import java.util.*;

/**
 *
 */
public class EmployeeDAO {
    private static final Map<String, Employee> empMap = new HashMap<String, Employee>();

    static {
        initEmps();
    }

    private static void initEmps() {
        Employee employee1 = new Employee("E01", "Smith", "Clerk");
        Employee employee2 = new Employee("E02", "Allen", "Salesman");
        Employee employee3 = new Employee("E03", "Jones", "Manager");

        empMap.put(employee1.getEmpNo(), employee1);
        empMap.put(employee2.getEmpNo(), employee2);
        empMap.put(employee3.getEmpNo(), employee3);
    }

    public static Employee getEmployee(String empNo) {
        return empMap.get(empNo);
    }

    public static Employee addEmployee(Employee emp) {
        empMap.put(emp.getEmpNo(), emp);
        return emp;
    }

    public static Employee updateEmployee(Employee employee) {
        empMap.put(employee.getEmpNo(), employee);
        return employee;
    }

    public static void deleteEmployee(String empNo) {
        empMap.remove(empNo);
    }

    public static List<Employee> getAllEmployees() {
        Collection<Employee> c = empMap.values();
        List<Employee> list = new ArrayList<Employee>();
        list.addAll(c);
        return list;
    }

    List<Employee> list;

}
