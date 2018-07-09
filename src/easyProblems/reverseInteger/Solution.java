package easyProblems.reverseInteger;

public class Solution {

    //7. Reverse Integer

    //Given a 32-bit signed integer, reverse digits of an integer.

    public static void main(String[] args) {
        int number = -2147483648;
        System.out.println(reverse(number));
    }

    private static int reverse(int x) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean isNegative = x < 0;
        String number = String.valueOf(x);
        for (int i = number.length() - 1; i >= 0; i--) {
            if (!String.valueOf(number.charAt(i)).equals("-")) {
                stringBuilder.append(number.charAt(i));
            }
        }
        String result = stringBuilder.toString();
        if (Long.parseLong(result) > (Integer.MAX_VALUE)) return 0;
        return isNegative ? Integer.parseInt((result)) * -1 : Integer.parseInt((result));
    }
}
