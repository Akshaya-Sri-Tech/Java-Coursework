import java.util.Scanner;
public class FullPyramid {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=S.nextInt();    
        int i=0;
        while (i < n) {
            int j=0;
            while (j < n - i - 1) {
                System.out.print("  ");
                j++;
            }
            int k=0;
            while (k < 2 * i + 1) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}