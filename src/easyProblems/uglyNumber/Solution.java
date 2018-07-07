package easyProblems.uglyNumber;

class Solution {

    //263. Ugly Number

    //Write a program to check whether a given number is an ugly number.
    //
    //Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.

    public static void main(String[] args) {
        int number = 8;
        System.out.println(isUgly(number));
    }

    private static boolean isUgly(int num) {
        if (num <= 0) return false;
        while (num > 1) {
            if (num % 2 == 0) num /= 2;
            else if (num % 3 == 0) num /= 3;
            else if (num % 5 == 0) num /= 5;
            else
                return false;
        }
        return true;
    }
}