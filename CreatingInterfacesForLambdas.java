package javatraining.oletsky.lambdasandstreams;

/**
 * @author O.Oletsky
 * This example illustrates how to create a functional interface
 * for introducing lambdas
 */

public class CreatingInterfacesForLambdas {
    public static void main(String[] args) {
        Calculable c=(x)->Math.exp(x);
        exec(c, 2.);
    }

    static void exec(Calculable f, double x) {
        System.out.println(f.calculate(x));
    }
}

interface Calculable{
    double calculate(double x);
}