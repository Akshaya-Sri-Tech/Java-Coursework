import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=S.nextInt(); 
        if ((num&1) == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
        S.close();
    }
}