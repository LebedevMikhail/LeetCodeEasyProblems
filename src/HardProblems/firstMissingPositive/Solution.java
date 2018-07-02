package HardProblems.firstMissingPositive;

import java.util.*;

public class Solution {

    //41. First Missing Positive

    //Given an unsorted integer array, find the smallest missing positive integer.

    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, -1, 1};
        System.out.println(firstMissingPositive(nums));
    }

    private static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        List<Integer> positiveNumbers = new ArrayList<>();
        for (int num : nums) {
            if ((num > 0) && (!positiveNumbers.contains(num))) positiveNumbers.add(num);
        }
        int missingPositive = 1;
        for (int num : positiveNumbers) {
            if (num > missingPositive) return missingPositive;
            else missingPositive++;
        }
        return missingPositive;
    }
}
