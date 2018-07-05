package easyProblems.myPow;

public class Solution {

    //50. Pow(x, n)

    //Implement pow(x, n), which calculates x raised to the power n (xn).

    public static void main(String[] args) {
        System.out.println(myPow(2, -2));
    }

    private static double myPow(double x, int n) {
        long number = n;
        if (number < 0){
            x = 1 / x;
            number = -number;
        }
        double result = 1;
        while (number > 0){
            if (number % 2 == 1){
                result = result * x;
            }
            number = number / 2;
            x = x * x;
        }
        return result;
    }
}
