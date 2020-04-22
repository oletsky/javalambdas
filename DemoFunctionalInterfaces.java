package javatraining.oletsky.lambdasandstreams;

/**
 * Actually, lambdas are realisations of functional interfaces.
 * This example illustrates this statement
 */

public class DemoFunctionalInterfaces {
    public static void main(String[] args) {
        FuncInterf foo = (s)-> System.out.println(s);
        foo.operate("The lambda has been called!");
    }
}

interface FuncInterf {
    void operate(String s);
}