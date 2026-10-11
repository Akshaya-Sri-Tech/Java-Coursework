import java.util.*;

class Voting {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            try {
                if (age < 18)
                    throw new Exception("Not eligible for voting");
                System.out.println("Eligible for voting");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}