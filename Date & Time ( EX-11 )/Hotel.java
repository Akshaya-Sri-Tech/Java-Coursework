import java.time.*;
import java.util.*;

class Hotel {
    public static void main(String[] a) {
        System.out.print("Name: ");
        try (Scanner s = new Scanner(System.in)) {
            String name = s.nextLine();
            System.out.print("Check-in (yyyy-MM-dd HH:mm): ");
            LocalDateTime in = LocalDateTime.parse(s.nextLine().replace(" ", "T"));
            System.out.print("Check-out (yyyy-MM-dd HH:mm): ");
            LocalDateTime out = LocalDateTime.parse(s.nextLine().replace(" ", "T"));
            long hrs = Duration.between(in, out).toHours(), nights = (hrs + 23) / 24;
            System.out.print("Rate/night: ");
            double r = s.nextDouble();
            System.out.println("Guest: " + name);
            System.out.println("Days: " + (hrs / 24) + ", Nights: " + nights + "\nBill: " + nights * r);
        }
    }
}