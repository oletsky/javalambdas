package javatraining.oletsky.lambdasandstreams;

import java.util.stream.IntStream;

public class StreamAPIExample {
    public static void main(String[] args) {
            long count = IntStream.of(2, 5, 4, 8, 3).
                    filter(w -> w%2==0).
                    count();
            System.out.println(count);
    }

}
