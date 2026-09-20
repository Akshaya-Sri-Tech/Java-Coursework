import java.util.Arrays;
import java.util.Scanner;

public class bowl{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        System.out.print("Enter the number of bowls : ");
        int n=S.nextInt();
        int bowls[][]=new int[n][2];
        System.out.println("Enter the bowl's dimensions : {L,H} ");
        for(int i=0;i<n;i++){
            bowls[i][0]=S.nextInt();
            bowls[i][1]=S.nextInt();
        }
        Arrays.sort(bowls, (a, b) -> {if (a[0] != b[0])
                return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });

        int count=1;
        for(int i=1;i<n;i++)
            if(bowls[i][0]>bowls[i-1][0] && bowls[i][1]>bowls[i-1][1])
                count++;

        System.out.println("The maximum number of bowl that can be placed inside another bowl : "+count);
                S.close();
    }
}