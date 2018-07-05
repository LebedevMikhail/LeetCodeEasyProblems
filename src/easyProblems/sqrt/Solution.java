package easyProblems.sqrt;

public class Solution {

    //69. Sqrt(x)

    //Implement int sqrt(int x).
    //
    //Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
    //
    //Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }

    private static int mySqrt(int x) {
        long number = x;
        while (Math.pow(number, 2) > x)
            number = (number + x / number) / 2;
        return (int) number;
    }
}
