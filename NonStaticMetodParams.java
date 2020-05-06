package javatraining.oletsky.lambdasandstreams;

import java.util.function.Supplier;

public class NonStaticMetodParams {
    public static void main(String[] args) {
        NonStaticCalculator c=new NonStaticCalculator(5);
        exec(c::calc);
    }

    static void exec(Supplier<Double> fun) {
        System.out.println(fun.get());
    }
}

class NonStaticCalculator {
    private double x;
    public NonStaticCalculator(double x) { this.x = x;}
    double calc() {
        return x*x;
    }
}

