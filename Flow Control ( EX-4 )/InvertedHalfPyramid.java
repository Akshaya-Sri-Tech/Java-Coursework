import java.util.Scanner;
public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=S.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}