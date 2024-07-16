package ru.gb.matCalc.ComplexCalc.Factory;


import ru.gb.matCalc.ComplexCalc.ComplexCalc;

public interface CalcFactory {
    ComplexCalc create(double realPart, double imaginaryPart);
}
