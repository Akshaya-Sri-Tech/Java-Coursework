import java.util.Scanner;
public class NumberTriangle {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=S.nextInt();
        //do while loop
        int i=0;
        do {
            int j=0;
            do {
                System.out.print(j+1+" ");
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i < n);
    }
}