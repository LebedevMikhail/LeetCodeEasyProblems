package easyProblems.maximalProduct;

import java.util.Arrays;

public class Solution {

    //628. Maximum Product of Three Numbers

    //  Given an integer array, find three numbers whose product is maximum and output the maximum product.

    public static void main(String[] args) {
        int[] nums = new int[]{-4, -3, -2, -1, 60};
        System.out.println(maximumProduct(nums));
    }

    private static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int multiplyWithPositiveNumbers = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int multiplyWithNegativeNumbers = nums[0] * nums[1] * nums[nums.length - 1];
        return multiplyWithPositiveNumbers > multiplyWithNegativeNumbers ? multiplyWithPositiveNumbers : multiplyWithNegativeNumbers;
    }
}
