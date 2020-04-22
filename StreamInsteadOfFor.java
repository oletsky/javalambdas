package javatraining.oletsky.arrays;

import java.util.stream.DoubleStream;

/**
 * @author O.Oletsky
 * A simple example illustrating how to replace the for loop with Stream API
 */
public class StreamInsteadOfFor {
    public static void main(String[] args) {
        double[] arr={1.,2.,3.,4.,5};
        //Using traditional loops
        double s=0;
        for (double v:arr) {
            s+=v*10.;
        }
        System.out.printf("Sum of array by loop is %8.3f\n",s);
        //Using streams
        double d = DoubleStream.of(arr).map(x->10*x).sum();
        System.out.printf("Sum of array by streams is %8.3f\n",d);
    }
}
