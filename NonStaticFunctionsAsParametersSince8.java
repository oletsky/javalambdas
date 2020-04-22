package javatraining.oletsky.lambdasandstreams;

import java.util.function.Supplier;

/**
 * @author O.Oletsky
 * Demonstrating non-static functions as parameters on the
 * base of functional interfaces
 */

public class NonStaticFunctionsAsParametersSince8 {
    public static void main(String[] args) {
        Calculator c=new Calculator(5);
        exec(c::calc);
    }


    static void exec(Supplier<Double> fun) {
        System.out.println(fun.get());
    }
}

class Calculator {
    private double x;

    public Calculator(double x) {
        this.x = x;
    }

    double calc() {
        return x*x;
    }
}
