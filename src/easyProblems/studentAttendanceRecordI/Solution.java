package easyProblems.studentAttendanceRecordI;

public class Solution {

    //  551. Student Attendance Record I

    //You are given a string representing an attendance record for a student. The record only contains the following three characters:
    //
    //    'A' : Absent.
    //    'L' : Late.
    //    'P' : Present.
    //
    //A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).
    //
    //You need to return whether the student could be rewarded according to his attendance record.


    public static void main(String[] args) {
        String record = "LALL";
        System.out.println(checkRecord(record));
    }

    private static boolean checkRecord(String s) {
        int countA = 0, countL = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                countA++;
            }
            if (countL != 0 && s.charAt(i) != 'L') countL = 0;
            if (s.charAt(i) == 'L') countL++;
            if (countA > 1 || countL > 2) return false;

        }
        return true;
    }
}
