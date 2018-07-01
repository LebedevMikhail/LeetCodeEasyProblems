package reverseString;

public class Solution {

    //344. Reverse String

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverseString(str));
    }

    private static String reverseString(String s) {
        String[] str = s.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            stringBuilder.append(str[i]);
        }
        return stringBuilder.toString();
    }
}
