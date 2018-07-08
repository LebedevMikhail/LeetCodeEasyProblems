package easyProblems.powerOfFour;

public class Solution {

    //342. Power of Four

    //Given an integer (signed 32 bits),
    // write a function to check whether it is a power of 4

    public static void main(String[] args) {
        int number = 16;
        System.out.println(isPowerOfFour(number));
    }

    private static boolean isPowerOfFour(int num) {
        return (int) (Math.log(num) / Math.log(4)) == (Math.log(num) / Math.log(4));
    }
}
