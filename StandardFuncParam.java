package javatraining.oletsky.lambdasandstreams;

import java.util.function.Function;

public class StandardFuncParam {
    public static void main(String[] args) {
        showTable(Math::sin);
    }


    static void showTable(Function<Double,Double> fun) {
        for (double d=0.; d<=1.; d+=0.1) {
            System.out.println(d+": "+fun.apply(d));
        }
    }
}

