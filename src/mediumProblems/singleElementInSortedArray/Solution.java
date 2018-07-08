package mediumProblems.singleElementInSortedArray;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    //540. Single Element in a Sorted Array

    //Given a sorted array consisting of only integers where every element appears twice except for one element which appears once.
    // Find this single element that appears only once.


    public static void main(String[] args) {
        int[] nums = new int[]{3, 3, 7, 7, 10, 11, 11};
        System.out.println(singleNonDuplicate(nums));
    }

    private static int singleNonDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            if (numbers.contains(num)) numbers.remove(num);
            else {
                numbers.add(num);
            }
        }
        String result = String.valueOf(numbers.toString().replace("[", "").replace("]", ""));
        return Integer.parseInt(result);
    }
}
