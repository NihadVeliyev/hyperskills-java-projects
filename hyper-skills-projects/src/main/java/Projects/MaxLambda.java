package Projects;

import java.util.function.BiFunction;

public class MaxLambda {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> max = (a, b) -> a > b ? a : b;

        System.out.println(max.apply(3, 5));  // Output: 5
        System.out.println(max.apply(10, 2)); // Output: 10
        System.out.println(max.apply(-1, 0)); // Output: 0
    }
}