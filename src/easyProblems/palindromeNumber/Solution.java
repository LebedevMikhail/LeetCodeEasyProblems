package easyProblems.palindromeNumber;

public class Solution {

    //9. Palindrome Number

    //Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.


    public static void main(String[] args) {
        int number = 121;
        System.out.println(isPalindrome(number));
    }

    private static boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        for (int i = 0; i < (number.length()) / 2; i++) {
            if (number.charAt(i) != number.charAt(number.length() - 1 - i)) return false;
        }
        return true;

    }
}
