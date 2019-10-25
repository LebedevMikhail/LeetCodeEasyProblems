package easyProblems.lengthofLastWord;

public class Solution {

    //58. Length of Last Word

    //Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
    //
    //If the last word does not exist, return 0.
    //
    //Note: A word is defined as a character sequence consists of non-space characters only.


    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    private static int lengthOfLastWord(String s) {
        String[] array = s.split(" ");
        int result;
        if(array.length==0) return 0 ;
        result= (array.length == 1 ) ? array[0].length() : array[array.length-1].length();
        return result;
    }
}
