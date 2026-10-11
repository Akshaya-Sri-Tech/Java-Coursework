import java.time.*;
import java.util.*;

class Subscription {
    public static void main(String[] a) {
        System.out.print("Start (yyyy-MM-dd HH:mm): ");
        try (Scanner s = new Scanner(System.in)) {
            LocalDateTime st = LocalDateTime.parse(s.nextLine().replace(" ", "T"));
            System.out.print("Validity (days): ");
            long d = s.nextLong();
            LocalDateTime ex = st.plusDays(d);
            long rem = Duration.between(LocalDateTime.now(), ex).toDays();
            System.out.println("Expiry: " + ex);
            System.out.println("Expiry day: " + ex.getDayOfWeek());
            System.out.println("Days remaining: " + Math.max(0, rem));
        }
    }
}