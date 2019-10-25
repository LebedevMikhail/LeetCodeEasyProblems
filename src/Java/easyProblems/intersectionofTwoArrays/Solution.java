package easyProblems.intersectionofTwoArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    //349. Intersection of Two Arrays

    //Given two arrays, write a function to compute their intersection.


    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{1, 1};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length > 0 && nums2.length > 0) {
            Set<Integer> set1 = new HashSet<>();
            for (int i : nums1) {
                set1.add(i);
            }
            Set<Integer> set2 = new HashSet<>();
            for (int i : nums2) {
                if (set1.contains(i)) set2.add(i);
            }
            int[] result = new int[set2.size()];
            int i = 0;
            for (int n : set2) {
                result[i++] = n;
            }
            return result;
        } else return new int[0];
    }
}
