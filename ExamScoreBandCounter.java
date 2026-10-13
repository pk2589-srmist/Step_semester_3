public class ExamScoreBandCounter {
    private static int lowerBound(int[] scores, int target) {
        int left = 0, right = scores.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (scores[mid] < target) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    private static int upperBound(int[] scores, int target) {
        int left = 0, right = scores.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (scores[mid] <= target) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    public static int countInBand(int[] scores, int low, int high) {
        int start = lowerBound(scores, low);
        int end = upperBound(scores, high);
        return end - start;
    }

    public static void main(String[] args) {
        int[] scores1 = {35, 42, 42, 50, 58, 58, 58, 63, 71, 88};
        System.out.println(countInBand(scores1, 42, 58));
        int[] scores2 = {35, 42, 42, 50, 58, 58, 58, 63, 71, 88};
        System.out.println(countInBand(scores2, 90, 100));
    }
}
