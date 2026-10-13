import java.util.*;

public class DutyRosterRotation {
    public static List<String> rotateRoster(List<String> names, int k) {
        int n = names.size();
        k = k % n;
        List<String> rotated = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            rotated.add(names.get((i - k + n) % n));
        }
        return rotated;
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("A", "B", "C", "D", "E");
        System.out.println(rotateRoster(names, 2)); 
        System.out.println(rotateRoster(names, 7)); 
    }
}
