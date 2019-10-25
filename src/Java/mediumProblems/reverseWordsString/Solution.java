package mediumProblems.reverseWordsString;


public class Solution {

    //557. Reverse Words in a String III

    //Given a string, you need to reverse the order of characters
    // in each word within a sentence while still preserving whitespace and initial word order.


    public static void main(String[] args) {
        String str = "the sky is blue";
        //String str = "   a   b ";

        System.out.println(reverseWords(str));
    }

    private static String reverseWords(String s) {
        while (s.contains("  ")) {
            s = s.replace("  ", " ");
        }
        String[] array = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = array.length; i > 0; i--) {
            builder.append(array[i - 1]).append(" ");
        }
        return builder.toString().trim();
    }
}
