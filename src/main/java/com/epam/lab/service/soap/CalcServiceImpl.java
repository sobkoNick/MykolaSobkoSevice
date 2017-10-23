package com.epam.lab.service.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 */
@WebService
public class CalcServiceImpl implements CalcService {
    NumberFormat formatter = new DecimalFormat("#0.0000");
    @WebMethod
    public String plus(double firstN, double secondN) {
        try {
            return formatter.format ((firstN + secondN));
        } catch (Exception e) {
            System.out.println("some error occured");
            return "data error";
        }
    }

    @WebMethod
    public String minus(double firstN, double secondN) {
        try {
            return formatter.format ((firstN - secondN));
        } catch (Exception e) {
            System.out.println("some error occured");
            return "data error";
        }
    }

    @WebMethod
    public String division(double firstN, double secondN) {
        try {
            return formatter.format ((firstN / secondN));
        } catch (Exception e) {
            System.out.println("some error occured");
            return "data error";
        }
    }

    @WebMethod
    public String multiple(double firstN, double secondN) {
        try {
            return formatter.format ((firstN * secondN));
        } catch (Exception e) {
            System.out.println("some error occured");
            return "data error";
        }
    }

    @WebMethod
    public String percent(double firstN, double secondN) {
        try {
            return formatter.format ((firstN % secondN));
        } catch (Exception e) {
            System.out.println("some error occured");
            return "data error";
        }
    }
}
