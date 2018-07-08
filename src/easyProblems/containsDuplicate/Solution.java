package easyProblems.containsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    //217. Contains Duplicate

    //Given an array of integers, find if the array contains any duplicates.
    //
    //Your function should return true if any value appears at least twice in the array,
    // and it should return false if every element is distinct.


    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            if (!numbers.contains(num)) numbers.add(num);
            else {
                return true;
            }
        }
        return false;
    }
}
