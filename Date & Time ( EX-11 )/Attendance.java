import java.time.*;
import java.util.*;

class Attendance {
    public static void main(String[] a) {
        System.out.print("Login (yyyy-MM-dd HH:mm): ");
        try (Scanner s = new Scanner(System.in)) {
            LocalDateTime in = LocalDateTime.parse(s.nextLine().replace(" ", "T"));
            System.out.print("Logout (yyyy-MM-dd HH:mm): ");
            LocalDateTime out = LocalDateTime.parse(s.nextLine().replace(" ", "T"));
            long min = Duration.between(in, out).toMinutes();
            if (min >= 480)
                System.out.println("Attendance approved");
            else
                System.out.println("Attendance not approved");
            System.out.println("Hours worked: " + min / 60 + "." + min % 60);
        }
    }
}
