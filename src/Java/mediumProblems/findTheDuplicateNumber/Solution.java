package mediumProblems.findTheDuplicateNumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    //287. Find the Duplicate Number

    //Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive),
    // prove that at least one duplicate number must exist. Assume that there is only one duplicate number,
    // find the duplicate one.

    public static void main(String[] args) {
    int[] nums = new int[]{1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }

    private static int findDuplicate(int[] nums) {
        Set<Integer> setNumber = new HashSet<>();
        for (int num : nums) if(setNumber.contains(num)) return num; else setNumber.add(num);
        return 0;
    }
}
