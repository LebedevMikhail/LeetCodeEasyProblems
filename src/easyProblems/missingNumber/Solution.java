package easyProblems.missingNumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {

    //268. Missing Number

    //Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

    public static void main(String[] args) {
        //int[] nums = new int[]{3, 0, 1};
        int[] nums = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        //int[] nums = new int[]{1,2};
        //int[] nums = new int[]{0};

        System.out.println(missingNumber(nums));
    }

    private static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> setNumber = new HashSet<>();
        for (int num : nums) setNumber.add(num);
        for (int i = 0; i < nums.length; i++) {
            if (!setNumber.contains(i)) return i;
        }
        return ++nums[nums.length-1];
    }
}
