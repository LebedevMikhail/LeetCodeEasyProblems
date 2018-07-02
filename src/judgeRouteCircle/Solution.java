package judgeRouteCircle;

public class Solution {

    //657. Judge Route Circle

    // Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

    //The move sequence is represented by a string.
    // And each move is represent by a character.
    // The valid robot moves are R (Right), L (Left), U (Up) and D (down).
    // The output should be true or false representing whether the robot makes a circle.


    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
    }


    private static boolean judgeCircle(String moves) {
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
