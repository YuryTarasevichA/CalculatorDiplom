package ru.gb.matCalc.ComplexCalc;



import org.springframework.stereotype.Controller;
import ru.gb.matCalc.ComplexCalc.Factory.CalcFactory;

import java.util.Scanner;
@Controller
public class ComplexCalcController {
    private CalcFactory calcFactoryComplex;


    public ComplexCalcController(CalcFactory calcFactoryComplex) {
        this.calcFactoryComplex = calcFactoryComplex;
    }

    public void program() {
        Scanner scanner = new Scanner(System.in);
        ComplexCalculate  complex, result;
        int choise;
        do {
            System.out.println("Выберите операцию:");
            System.out.println("1. Посчитать");
            System.out.println("0. Выйти");
            choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    while (true) {
                        double realPart = promptDouble("Введите действительную часть комплексного числа: ");
                        double imaginaryPart = promptDouble("Введите мнимую часть комплексного числа: ");
                        ComplexCalc complexCalculate =
                                calcFactoryComplex.create(realPart, imaginaryPart);
                        double real = promptDouble("Введите действительную часть второго комплексного числа: ");
                        double imaginary = promptDouble("Введите мнимую часть второго комплексного числа: ");
                        complex = new ComplexCalculate(real, imaginary);
                        String cmd = prompt("Выбирете действие: +, -, *, / :  ");
                        if (cmd.equals("+")) {
                            result = (ComplexCalculate) complexCalculate.add(complex);
                            System.out.println(result.toString());
                            break;
                        }
                        if (cmd.equals("-")){
                            result = (ComplexCalculate) complexCalculate.subtract(complex);
                            System.out.println(result.toString());
                            break;
                        }
                        if (cmd.equals("*")){
                            result = (ComplexCalculate) complexCalculate.multiply(complex);
                            System.out.println(result.toString());
                            break;
                        }
                        if (cmd.equals("/")){
                            result = (ComplexCalculate) complexCalculate.divide(complex);
                            System.out.println(result.toString());
                            break;
                        }
                    }
                case 0:
                    System.out.println("Выход из калькулятора комплексных чисел");
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте еще раз.");
            }
        } while (choise != 0);


    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextDouble();
    }
}
