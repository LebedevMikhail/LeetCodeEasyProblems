package easyProblems.searchInsertPosition;

import java.util.Arrays;

public class Solution {

    //35. Search Insert Position

    //Given a sorted array and a target value, return the index if the target is found.
    // If not, return the index where it would be if it were inserted in order.

    //You may assume no duplicates in the array.

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        int position = 5;
        System.out.println(searchInsert(nums, position));
    }

    private static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = nums[mid];

            if (midVal < target)
                low = mid + 1;
            else if (midVal > target)
                high = mid - 1;
            else
                return mid;
        }
        return low;
    }


}
