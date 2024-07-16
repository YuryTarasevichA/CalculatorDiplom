package ru.gb.matCalc.ComplexCalc;

public interface ComplexCalc {
    double getRealPart();
    double getImaginaryPart();
    void setRealPart(double realPart);
    void setImaginaryPart(double imaginaryPart);
    ComplexCalc add(ComplexCalc other);
    ComplexCalc subtract(ComplexCalc other);
    ComplexCalc multiply(ComplexCalc other);
    ComplexCalc divide(ComplexCalc other);
}
