import java.util.*;
public class SportsCost {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        String[][] team = new String[2][4];

        System.out.println("Enter Team Table:( | Bat | Ball | Sports Uniform)");
        for(int i=0;i<2;i++)
            for(int j=0;j<4;j++)
                team[i][j]=S.nextLine();

        String[][] price = new String[3][2];

        System.out.println("Enter Price Table:( | Price)");
        for(int i=0;i<3;i++)
            for(int j=0;j<2;j++)
                price[i][j]=S.nextLine();

        int womenCost = 0;
        int menCost = 0;
        for(int i=1;i<4;i++){
            womenCost += Integer.parseInt(team[0][i]) *
                         Integer.parseInt(price[i-1][1]);

            menCost += Integer.parseInt(team[1][i]) *
                       Integer.parseInt(price[i-1][1]);
        }
        System.out.println("Women Team Cost = " + womenCost);
        System.out.println("Men Team Cost = " + menCost);
                S.close();
    }
}