package PatternAdapter;

import TestingPractise.Calc;

import static PatternAdapter.Calculator.Operation.*;

public class IntsCalculator implements Ints{
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg1, int arg2) {
        return (int) target.newFormula()
                .addOperand(arg1)
                .addOperand(arg2)
                .calculate(SUM)
                .result();
    }


    @Override
    public int mult(int arg1, int arg2) {
        return (int) target.newFormula()
                .addOperand(arg1)
                .addOperand(arg2)
                .calculate(MULT)
                .result();
    }

    @Override
    public int pow(int a, int b) {
        return (int) target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(POW)
                .result();
    }
}
