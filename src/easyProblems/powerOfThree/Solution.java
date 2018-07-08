package easyProblems.powerOfThree;

public class Solution {

    //326. Power of Three

    //Given an integer, write a function to determine if it is a power of three.

    public static void main(String[] args) {
        int number = 28;
        System.out.println(isPowerOfTwo(number));
    }

    private static boolean isPowerOfTwo(int n) {
        int count = 0;
        double number = 0;
        while (n >= number) {
            number = Math.pow(3, count);
            if (number == n) return true;
            count++;
        }
        return false;
    }
}
