import java.util.*;

class CreditLimit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter withdrawal amount: ");
            int amount = sc.nextInt();
            try {
                if (amount > 10000)
                    throw new Exception("Credit limit exceeded");
                System.out.println("Withdrawal successful");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}