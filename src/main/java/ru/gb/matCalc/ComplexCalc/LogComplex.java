package ru.gb.matCalc.ComplexCalc;

public class LogComplex implements ComplexCalc{
    private ComplexCalc decorated;
    private Logable logger;

    public LogComplex(ComplexCalculate decorated, Logable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public double getRealPart() {
        return decorated.getRealPart();
    }

    @Override
    public double getImaginaryPart() {
        return decorated.getImaginaryPart();
    }

    @Override
    public void setRealPart(double realPart) {
        decorated.setRealPart(realPart);
    }

    @Override
    public void setImaginaryPart(double imaginaryPart) {
        decorated.setImaginaryPart(imaginaryPart);
    }

    @Override
    public ComplexCalc add(ComplexCalc other) {
        logger.log("вызвался метод сложения");
        return decorated.add(other);
    }

    @Override
    public ComplexCalc subtract(ComplexCalc other) {
        logger.log("вызвался метод вычитания");
        return decorated.subtract(other);
    }

    @Override
    public ComplexCalc multiply(ComplexCalc other) {
        logger.log("вызвался метод умножения");
        return decorated.multiply(other);
    }

    @Override
    public ComplexCalc divide(ComplexCalc other) {
        logger.log("вызвался метод деления");
        return decorated.divide(other);
    }
}
