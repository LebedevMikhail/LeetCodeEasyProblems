package selfDiviningNumbers;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    //728. Self Dividing Numbers

    //A self-dividing number is a number that is divisible by every digit it contains.
    // For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
    // Also, a self-dividing number is not allowed to contain the digit zero.
    // Given a lower and upper number bound, output a list of every possible self dividing number,
    // including the bounds if possible.

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1, 22));
    }


    private static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDivine(i)) numbers.add(i);
        }
        return numbers;
    }

    private static boolean isSelfDivine(int i) {
        boolean check = true;
        int number = i;
        while (number > 0) {
            int remainder = number % 10;
            number /= 10;
            if ((remainder == 0) || ((i % remainder) > 0)) check = false;
        }
        return check;
    }
}
