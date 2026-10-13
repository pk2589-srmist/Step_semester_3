public class AttendanceTracker {
    public static void attendanceSummary(int[] days) {
        int presentCount = 0;
        int longestStreak = 0;
        int currentStreak = 0;

        for (int d : days) {
            if (d == 1) {
                presentCount++;
                currentStreak++;
                if (currentStreak > longestStreak) longestStreak = currentStreak;
            } else {
                currentStreak = 0;
            }
        }

        System.out.println("Present: " + presentCount + ", Longest streak: " + longestStreak);
    }

    public static void main(String[] args) {
        int[] days1 = {1, 1, 0, 1, 1, 1, 0, 1};
        int[] days2 = {0, 0, 0};
        attendanceSummary(days1);
        attendanceSummary(days2); 
    }
}
