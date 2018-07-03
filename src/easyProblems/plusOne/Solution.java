package easyProblems.plusOne;

import java.util.Arrays;

public class Solution {

    //66. Plus One

    //Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
    //
    //The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
    //
    //You may assume the integer does not contain any leading zero, except the number 0 itself.

    public static void main(String[] args) {
        int[] nums = new int[]{9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }

    private static int[] plusOne(int[] digits) {
        int length = digits.length - 1;
        while (length >= 0) {
            if (digits[length] >= 9) {
                digits[length] = 1;
                digits[length] = 0;
            } else {
                digits[length]++;
                return digits;
            }
            length--;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }


}
