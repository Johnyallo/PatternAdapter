package PatternAdapter;

import TestingPractise.Calc;

public class IntsCalculator implements Ints{
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg1, int arg2) {
        return arg1 + arg2;
    }

    @Override
    public int mult(int arg1, int arg2) {
        return arg1 * arg2;
    }

    @Override
    public int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
