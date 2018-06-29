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
}
