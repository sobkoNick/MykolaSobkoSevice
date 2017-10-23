package com.epam.lab.service.rest.employee;

import com.epam.lab.service.rest.Calc;
import com.epam.lab.service.rest.CalcDAO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

/**
 *
 */
@Path("/employees")
public class EmployeeService {

    NumberFormat formatter = new DecimalFormat("#0.0000");
    // URI:
    // /contextPath/servletPath/employees
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Employee> getEmployees_JSON() {
        List<Employee> listOfCountries = EmployeeDAO.getAllEmployees();
        return listOfCountries;
    }

    // URI:
    // /contextPath/servletPath/employees/{empNo}
    @GET
    @Path("/{empNo}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Employee getEmployee(@PathParam("empNo") String empNo) {
        return EmployeeDAO.getEmployee(empNo);
    }

    // URI:
    // /contextPath/servletPath/employees
    @POST
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Employee addEmployee(Employee emp) {
        return EmployeeDAO.addEmployee(emp);
    }

    // URI:
    // /contextPath/servletPath/employees
    @PUT
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Employee updateEmployee(Employee emp) {
        return EmployeeDAO.updateEmployee(emp);
    }

    @DELETE
    @Path("/{empNo}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void deleteEmployee(@PathParam("empNo") String empNo) {
        EmployeeDAO.deleteEmployee(empNo);
    }

    // calc

//    @GET
//    @Path("/plus/{firstN}/{secondN}")
//    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
//    public Calc plus(@PathParam("firstN") double firstN, @PathParam("secondN") double secondN) {
//        return CalcDAO.plus(firstN, secondN);
//    }
//
//    @GET
//    @Path("/minus/{firstN}/{secondN}")
//    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
//    public Calc minus(@PathParam("firstN") double firstN, @PathParam("secondN") double secondN) {
//        return CalcDAO.minus(firstN, secondN);
//    }
//
//    @GET
//    @Path("/division/{firstN}/{secondN}")
//    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
//    public Calc division(@PathParam("firstN") double firstN, @PathParam("secondN") double secondN) {
//        return CalcDAO.division(firstN, secondN);
//    }
//
//    @GET
//    @Path("/multiple/{firstN}/{secondN}")
//    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
//    public Calc multiple(@PathParam("firstN") double firstN, @PathParam("secondN") double secondN) {
//        return CalcDAO.multiple(firstN, secondN);
//    }
//
//    @GET
//    @Path("/percent/{firstN}/{secondN}")
//    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
//    public Calc percent(@PathParam("firstN") double firstN, @PathParam("secondN") double secondN) {
//        return CalcDAO.percent(firstN, secondN);
//    }

}
