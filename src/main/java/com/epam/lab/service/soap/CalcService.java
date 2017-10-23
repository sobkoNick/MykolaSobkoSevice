package com.epam.lab.service.soap;

/**
 *
 */
public interface CalcService {
    String plus(double firstN, double secondN);
    String minus(double firstN, double secondN);
    String division(double firstN, double secondN);
    String multiple(double firstN, double secondN);
    String percent(double firstN, double secondN);
}
