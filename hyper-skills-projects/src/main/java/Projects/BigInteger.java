package Projects;

import java.util.Scanner;

public class BigInteger {

    /**
     * It returns true if at least two of three given numbers are equal, otherwise - false.
     */
    public static boolean atLeastTwoAreEqual(java.math.BigInteger num1, java.math.BigInteger num2, java.math.BigInteger num3) {
        return (num1.equals(num2)) || (num2.equals(num3)) || (num1.equals(num3)); // fix this line
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String[] parts = scanner.nextLine().split("\\s+");

        java.math.BigInteger num1 = null;
        java.math.BigInteger num2 = null;
        java.math.BigInteger num3 = null;

        try {
            num1 = new java.math.BigInteger(parts[0]);
            num2 = new java.math.BigInteger(parts[1]);
            num3 = new java.math.BigInteger(parts[2]);
        } catch (Exception e) {
            System.out.println("Can't parse a big integer value");
            e.printStackTrace();
        }

        System.out.println(atLeastTwoAreEqual(num1, num2, num3) ? "YES" : "NO");
    }
}