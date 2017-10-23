package com.epam.lab.service.soap;

import javax.xml.ws.Endpoint;

/**
 *
 */
public class Exporter {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8090/calc", new CalcServiceImpl());
        System.out.println("Calc SOAP Server started");
    }

//    public static void main(String[] args) {
//        CalcServiceImpl calcService = new CalcServiceImpl();
//        System.out.println(calcService.plus(2,2));
//    }
}
