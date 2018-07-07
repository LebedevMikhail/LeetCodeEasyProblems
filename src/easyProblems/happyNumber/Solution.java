package easyProblems.happyNumber;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    //202. Happy Number

    //Write an algorithm to determine if a number is "happy".
    //
    //A happy number is a number defined by the following process: Starting with any positive integer,
    // replace the number by the sum of the squares of its digits,
    // and repeat the process until the number equals 1 (where it will stay),
    // or it loops endlessly in a cycle which does not include 1.
    // Those numbers for which this process ends in 1 are happy numbers.


    public static void main(String[] args) {
        int number = 1111111;
        System.out.println(isHappy(number));
    }

    private static boolean isHappy(int n) {
        List<Integer> numbers = new ArrayList<>();
        int sum;
        divisionNumberIntoDigits(n, numbers);
        int counter = 0;
        do {
            sum = 0;

            for (Integer number : numbers) sum += Math.pow(number, 2);
            numbers.clear();
            divisionNumberIntoDigits(sum, numbers);
            counter++;
        } while (counter < 5000);
        return sum == 1;
    }

    private static void divisionNumberIntoDigits(int n, List<Integer> numbers) {
        while (n > 0) {
            numbers.add(n % 10);
            n /= 10;
        }
    }
}
