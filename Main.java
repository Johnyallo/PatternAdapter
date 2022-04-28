package PatternAdapter;

import TestingPractise.Calc;

public class Main {
    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        System.out.println(calculator.newFormula()
//                .addOperand(5.0)
//                .addOperand(6.0)
//                .calculate(Calculator.Operation.MULT)
//                .result()
//        );
        Ints ints = new IntsCalculator();
        System.out.println(ints.mult(5, 7));
        System.out.println(ints.pow(5, 2));
        System.out.println(ints.sum(5, 7));

    }
}
