package com.epam.lab.service.rest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 */
@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class Calc {
    private double firstN;
    private double secondN;
    private String result;

    public Calc() {
    }

    public Calc(double firstN, double secondN, String result) {
        this.firstN = firstN;
        this.secondN = secondN;
        this.result = result;
    }

    public double getFirstN() {
        return firstN;
    }

    public void setFirstN(double firstN) {
        this.firstN = firstN;
    }

    public double getSecondN() {
        return secondN;
    }

    public void setSecondN(double secondN) {
        this.secondN = secondN;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
