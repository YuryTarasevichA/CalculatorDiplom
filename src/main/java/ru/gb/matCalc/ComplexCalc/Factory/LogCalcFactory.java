package ru.gb.matCalc.ComplexCalc.Factory;


import ru.gb.matCalc.ComplexCalc.ComplexCalc;
import ru.gb.matCalc.ComplexCalc.ComplexCalculate;
import ru.gb.matCalc.ComplexCalc.LogComplex;
import ru.gb.matCalc.ComplexCalc.Logable;

public class LogCalcFactory implements CalcFactory{
    private Logable logger;

    public LogCalcFactory(Logable logger) {
        this.logger = logger;
    }

    @Override
    public ComplexCalc create(double realPart, double imaginaryPart) {
        return new LogComplex(new ComplexCalculate(realPart, imaginaryPart),logger);
    }
}
