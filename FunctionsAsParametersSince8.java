package javatraining.oletsky.lambdasandstreams;

/**
 * @author O.Oletsky
 * Demonstrating functions as parameters on the base of functional interfaces
 */

import java.util.function.Function;

public class FunctionsAsParametersSince8 {

    public static void main(String[] args) {
        showTable(Math::sin);

    }

    static void showTable(Function<Double,Double> fun) {
        for (double d=0.; d<=1.; d+=0.1) {
            System.out.printf("%8.4f: %8.4f\n",d,fun.apply(d));
        }
    }

}
