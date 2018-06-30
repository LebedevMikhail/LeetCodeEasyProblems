import java.util.ArrayList;
import java.util.List;

public class Solution {

    //771. Jewels and Stones
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0; i < J.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (J.charAt(i) == S.charAt(j)) count++;
            }
        }
        return count;
    }

    //657. Judge Route Circle
    public boolean judgeCircle(String moves) {
        int[][] position = new int[2][2];
        for (int i = 0; i < position[0].length; i++) {
            for (int j = 0; j < position[1].length; j++) {
                position[i][j] = 0;
            }
        }
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    position[1][0]++;
                    break;
                case 'D':
                    position[1][0]--;
                    break;
                case 'L':
                    position[1][1]--;
                    break;
                case 'R':
                    position[1][1]++;
                    break;
            }
        }
        boolean check = false;
        if ((position[0][0] == position[1][0]) && (position[0][1] == position[1][1])) check = true;
        return check;
    }

    //728. Self Dividing Numbers
    public List<Integer> selfDividingNumbers(int left, int right) {
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
