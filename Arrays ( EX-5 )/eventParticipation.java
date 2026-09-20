import java.util.*;

public class eventParticipation{
    public static void main(String[] args) {

        Scanner S=new Scanner(System.in);

        System.out.print("Enter number of students who have registered for online quiz :");
        int s1=S.nextInt();
        S.nextLine();
        System.out.println("Enter their names :");
        String[] onlineQuiz=new String[s1];
        for(int i=0;i<s1;i++)
            onlineQuiz[i]=S.nextLine();

        System.out.print("Enter number of students who have registered for paper presentation :");
        int s2=S.nextInt();
        S.nextLine();
        System.out.println("Enter their names :");
        String[] paperPresentation=new String[s2];
        for(int i=0;i<s2;i++)
            paperPresentation[i]=S.nextLine();
        System.out.println("Those who have registered in both :");
        for(int i=0;i<s1;i++)
            for(int j=0;j<s2;j++)
                if(onlineQuiz[i].equals(paperPresentation[j])){
                    System.out.print(onlineQuiz[i]+" ");
                    break;
                }
                        S.close();
    }
}