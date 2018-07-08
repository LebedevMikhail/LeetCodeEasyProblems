package easyProblems.setMismatch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    //645. Set Mismatch

    // The set S originally contains numbers from 1 to n.
    // But unfortunately, due to the data error,
    // one of the numbers in the set got duplicated to another number in the set,
    // which results in repetition of one number and loss of another number.
    //
    //Given an array nums representing the data status of this set after the error.
    // Your task is to firstly find the number occurs twice and then find the number that is missing.
    // Return them in the form of an array.

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    private static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            if (numbers.contains(num)) result[0] = num;
            else numbers.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!numbers.contains(i)) result[1] = i;
        }
        return result;
    }
}
