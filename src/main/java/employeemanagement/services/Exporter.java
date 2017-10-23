package employeemanagement.services;

import javax.xml.ws.Endpoint;

/**
 *
 */
public class Exporter {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8090/any/name/you/like/employeeservice", new EmployeeServiceImpl());
        System.out.println("Server started");
    }
}
