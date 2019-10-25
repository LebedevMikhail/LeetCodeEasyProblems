package easyProblems.addDigits;

public class Solution {

    //258. Add Digits

    //Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

    public static void main(String[] args) {
        System.out.println(addDigits(39));
    }

    private static int addDigits(int num) {
        return num - 9 * ((num - 1) / 9);
    }
}
