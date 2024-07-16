package ru.gb.matCalc.ComplexCalc;

import org.springframework.stereotype.Controller;

@Controller
public class ComplexCalculate implements ComplexCalc {
    private double realPart;
    private double imaginaryPart;


    public ComplexCalculate(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public double getRealPart() {
        return realPart;
    }

    @Override
    public double getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    @Override
    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public ComplexCalc add(ComplexCalc other) {
        return new ComplexCalculate(this.realPart + other.getRealPart(),
                this.imaginaryPart + other.getImaginaryPart());
    }

    @Override
    public ComplexCalc subtract(ComplexCalc other) {
        return new ComplexCalculate(this.realPart - other.getRealPart(),
                this.imaginaryPart - other.getImaginaryPart());
    }

    @Override
    public ComplexCalc multiply(ComplexCalc other) {
        double real = this.realPart * other.getRealPart() - this.imaginaryPart * other.getImaginaryPart();
        double imaginary = this.realPart * other.getImaginaryPart() + this.imaginaryPart * other.getRealPart();
        return new ComplexCalculate(real, imaginary);
    }

    @Override
    public ComplexCalc divide(ComplexCalc other) {
        double denominator = other.getRealPart() * other.getRealPart() + other.getImaginaryPart() * other.getImaginaryPart();
        double real = (this.realPart * other.getRealPart() + this.imaginaryPart * other.getImaginaryPart()) / denominator;
        double imaginary = (this.imaginaryPart * other.getRealPart() - this.realPart * other.getImaginaryPart()) / denominator;
        return new ComplexCalculate(real, imaginary);
    }
    public String toString(){
        return "(" + realPart + ") + (" + imaginaryPart + ")i";
    }

}
