package easyProblems.validPalindrome;

public class Solution {

    //125. Valid Palindrome

    //Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
    //
    //Note: For the purpose of this problem, we define empty string as valid palindrome.

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String s) {
        String[] symbols = trimString(s).split("");
        int length = symbols.length % 2 == 0 ? symbols.length / 2 : (symbols.length - 1) / 2;
        for (int i = 0; i < length; i++) {
            if (!symbols[i].equals(symbols[symbols.length - 1 - i])) return false;
        }
        return true;
    }

    private static final String PUNCT = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ ";

    private static String trimString(String str) {
        StringBuilder result = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (PUNCT.indexOf(c) < 0) {
                result.append(c);
            }
        }
        return result.toString().replaceAll(" ", "").toLowerCase();
    }
}
