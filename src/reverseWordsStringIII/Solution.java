package reverseWordsStringIII;

public class Solution {

    //557. Reverse Words in a String III

    //Given a string, you need to reverse the order of characters
    // in each word within a sentence while still preserving whitespace and initial word order.

    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        System.out.println(reverseWords(str));
    }

    private static String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= str.length - 1; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                stringBuilder.append(str[i].charAt(str[i].length() - 1 - j));
            }
            if (i <= str.length - 1) stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

}
