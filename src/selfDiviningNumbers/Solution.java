package selfDiviningNumbers;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    //728. Self Dividing Numbers

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1,22));
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
