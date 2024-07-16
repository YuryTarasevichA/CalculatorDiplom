package ru.gb.matCalc.ComplexCalc.Factory;


import ru.gb.matCalc.ComplexCalc.ComplexCalculate;

public class CalcFactorComplex implements CalcFactory{

    @Override
    public ComplexCalculate create(double realPart, double imaginaryPart) {
        return new ComplexCalculate(realPart, imaginaryPart);
    }

}
