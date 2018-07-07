package easyProblems.detectCapital;

public class Solution {

    //520. Detect Capital

    // Given a word, you need to judge whether the usage of capitals in it is right or not.
    //
    //We define the usage of capitals in a word to be right when one of the following cases holds:
    //
    //    All letters in this word are capitals, like "USA".
    //    All letters in this word are not capitals, like "leetcode".
    //    Only the first letter in this word is capital if it has more than one letter, like "Google".
    //
    //Otherwise, we define that this word doesn't use capitals in a right way.


    public static void main(String[] args) {
        String word = "ggg";
        System.out.println(detectCapitalUse(word));
    }

    private static boolean detectCapitalUse(String word) {
        if ((word.length() > 1) && word.toUpperCase().equals(word.substring(0, 1)) && word.toLowerCase().equals(word.substring(1)) ||
                (word.toUpperCase().equals(word) || (word.toLowerCase().equals(word)))) return true;
        for (int i = 1; i < word.length(); i++) {
            if (!Character.isUpperCase(word.charAt(0)) || (Character.isUpperCase(word.charAt(i)))) return false;
        }
        return true;
    }

}

