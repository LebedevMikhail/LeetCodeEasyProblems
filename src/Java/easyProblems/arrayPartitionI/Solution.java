package easyProblems.arrayPartitionI;

import java.util.Arrays;

public class Solution {

    //561. Array Partition I

    //Given an array of 2n integers, your task is to group these integers into n pairs of integer,
    // say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.


    public static void main(String[] args) {
        int[] nums = new int[]{1,4,3,2};
        System.out.println(arrayPairSum(nums));

    }
    private static int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i=i+2){
            sum+=nums[i];
        }
        return sum;
    }
}
