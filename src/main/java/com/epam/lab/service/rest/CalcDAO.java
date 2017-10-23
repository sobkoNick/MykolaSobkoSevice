package com.epam.lab.service.rest;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 */
public class CalcDAO {
    static NumberFormat formatter = new DecimalFormat("#0.0000");
    public static Calc plus(double firstN, double secondN) {
        try {
            return new Calc(firstN, secondN, formatter.format ((firstN + secondN)));
        } catch (Exception e) {
            System.out.println("some error occured");
            return new Calc(firstN, secondN,"some error");
        }
    }

    public static Calc minus(double firstN, double secondN) {
        try {
            return new Calc(firstN, secondN, formatter.format ((firstN - secondN)));
        } catch (Exception e) {
            System.out.println("some error occured");
            return new Calc(firstN, secondN,"some error");
        }
    }

    public static Calc division(double firstN, double secondN) {
        try {
            return new Calc(firstN, secondN, formatter.format ((firstN / secondN)));
        } catch (Exception e) {
            System.out.println("some error occured");
            return new Calc(firstN, secondN,"some error");
        }
    }
    public static Calc multiple(double firstN, double secondN) {
        try {
            return new Calc(firstN, secondN, formatter.format ((firstN * secondN)));
        } catch (Exception e) {
            System.out.println("some error occured");
            return new Calc(firstN, secondN,"some error");
        }
    }
    public static Calc percent(double firstN, double secondN) {
        try {
            return new Calc(firstN, secondN, formatter.format ((firstN % secondN)));
        } catch (Exception e) {
            System.out.println("some error occured");
            return new Calc(firstN, secondN,"some error");
        }
    }
}
