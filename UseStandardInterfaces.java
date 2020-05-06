package javatraining.oletsky.lambdasandstreams;

import java.util.function.Function;

public class UseStandardInterfaces {
    public static void main(String[] args) {
        Function<Integer, Integer> func = x->(x*2);
        int q1 = func.apply(10);
        System.out.println(q1);

    }
}
