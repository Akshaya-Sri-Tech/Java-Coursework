import java.time.*;
import java.util.*;

class Job {
    public static void main(String[] a) {
        LocalDateTime st = LocalDateTime.of(2026, 12, 31, 23, 59, 45);
        System.out.print("Days hours minutes seconds: ");
        try (Scanner s = new Scanner(System.in)) {
            long d = s.nextLong(), h = s.nextLong(), m = s.nextLong(), sec = s.nextLong();
            long total = d * 24 + h + m + sec / 3600;
            LocalDateTime end = st.plusDays(d).plusHours(h).plusMinutes(m).plusSeconds(sec);
            System.out.println("Completion: " + end);
            System.out.println("Total hours: " + total);
            System.out.println("Day: " + end.getDayOfWeek());
        }
    }
}
