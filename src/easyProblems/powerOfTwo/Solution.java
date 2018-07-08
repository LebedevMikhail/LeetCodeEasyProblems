package easyProblems.powerOfTwo;

public class Solution {

    //231. Power of Two

    //Given an integer, write a function to determine if it is a power of two.

    public static void main(String[] args) {
        int number = 18;
        System.out.println(isPowerOfTwo(number));
    }

    private static boolean isPowerOfTwo(int n) {
        int count = 0;
        double number = 0;
        while (n >= number) {
            number = Math.pow(2, count);
            if (number == n) return true;
            count++;
        }
        return false;
    }
}
