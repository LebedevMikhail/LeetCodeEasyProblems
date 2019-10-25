package mediumProblems.shiftingLetters;

public class Solution {

    //848. Shifting Letters

    //We have a string S of lowercase letters, and an integer array shifts.
    //
    //Call the shift of a letter, the next letter in the alphabet, (wrapping around so that 'z' becomes 'a').
    //
    //For example, shift('a') = 'b', shift('t') = 'u', and shift('z') = 'a'.
    //
    //Now for each shifts[i] = x, we want to shift the first i+1 letters of S, x times.
    //
    //Return the final string after all such shifts to S are applied.

    public static void main(String[] args) {
        String str = "mkgfzkkuxownxvfvxasy";
        int[] shifts = new int[]{505870226, 437526072, 266740649, 224336793, 532917782, 311122363, 567754492, 595798950, 81520022, 684110326, 137742843, 275267355, 856903962, 148291585, 919054234, 467541837, 622939912, 116899933, 983296461, 536563513};
        System.out.println(shiftingLetters(str, shifts));
    }

    private static String shiftingLetters(String S, int[] shifts) {
        StringBuilder stringBuilder = new StringBuilder();
        int currentNumber;
        for (int i = 0; i < shifts.length; i++) {
            currentNumber = (int) S.charAt(i);
            currentNumber += sumSubArray(i, shifts.length, shifts);
            while (currentNumber < 97) currentNumber += 26;
            while (currentNumber > 122) currentNumber -= 26;
            stringBuilder.append((char) currentNumber);
        }
        return stringBuilder.toString();
    }

    private static long sumSubArray(int startIndex, int endIndex, int[] array) {
        long sum = 0;
        for (int i = startIndex; i < endIndex; i++)
            sum += array[i];
        return sum % 26;
    }
}
