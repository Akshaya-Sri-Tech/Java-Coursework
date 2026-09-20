import java.util.Scanner;


class Student {

    private int regno;
    private char grade;
    protected int t;

    void display() {
        System.out.println("Reg.NO : " + regno);
    }

    void getDetail(Scanner S) {
        System.out.print("Enter your Reg.No : ");
        regno = S.nextInt();
    }

    // Method Overloading - Without Bonus
    protected void CalcGrade(int total) {

        if (total > 90 && total <= 100)
            grade = 'S';
        else if (total > 80)
            grade = 'A';
        else if (total > 70)
            grade = 'B';
        else if (total > 60)
            grade = 'C';
        else if (total > 50)
            grade = 'D';
        else
            grade = 'F';
    }

    // Method Overloading - With Bonus
    protected void CalcGrade(int total, int bonus) {

        total = total + bonus;

        if (total > 100)
            total = 100;

        CalcGrade(total);
    }

    public void gradePrint() {
        System.out.println("YOUR GRADE : " + grade);
    }

    protected int readValidMark(Scanner S, String message) {

        int mark;

        while (true) {

            System.out.print(message);
            mark = S.nextInt();

            if (mark >= 0 && mark <= 100)
                return mark;

            System.out.println(
                "Invalid mark! Please enter a mark between 0 and 100."
            );
        }
    }
}


// PART TIME STUDENT
class PT extends Student {

    String sub[] = {"C++", "Java", "Python"};

    int assess1[] = new int[3];
    int assess2[] = new int[3];
    int cont_assess[] = new int[3];
    int end_sem[] = new int[3];
    int total[] = new int[3];

    int bonus;


    // Method Overriding
    @Override
    void getDetail(Scanner S) {

        super.getDetail(S);

        for (int i = 0; i < 3; i++) {

            System.out.println("\nENTER YOUR MARKS IN " + sub[i] + " :");

            cont_assess[i] = readValidMark(
                S,
                "Enter your Continuous Assessment mark : "
            );

            end_sem[i] = readValidMark(
                S,
                "Enter your End Sem mark : "
            );

            assess1[i] = readValidMark(
                S,
                "Enter your Assess 1 mark : "
            );

            assess2[i] = readValidMark(
                S,
                "Enter your Assess 2 mark : "
            );
        }

        Calc();

        System.out.print("\nDo you want to add bonus marks? (Y/N): ");
        char choice = S.next().charAt(0);

        if (choice == 'Y' || choice == 'y') {

            while (true) {

                System.out.print("Enter bonus marks: ");
                bonus = S.nextInt();

                if (bonus >= 0 && bonus <= 100)
                    break;

                System.out.println(
                    "Invalid bonus! Please enter a value between 0 and 100."
                );
            }
        }
        else {
            bonus = 0;
        }
    }


    // Method Overriding
    @Override
    void display() {

        super.display();

        t = (total[0] + total[1] + total[2]) / 3;

        if (bonus > 0)
            CalcGrade(t, bonus);       // Overloaded method
        else
            CalcGrade(t);              // Original method

        for (int i = 0; i < 3; i++) {

            System.out.println("\nSUBJECT : " + sub[i]);
            System.out.println("Assess 1 mark : " + assess1[i]);
            System.out.println("Assess 2 mark : " + assess2[i]);
            System.out.println("Continuous Assessment mark : "
                               + cont_assess[i]);
            System.out.println("End Sem mark : " + end_sem[i]);
            System.out.println("TOTAL : " + total[i]);
        }

        System.out.println("\nAVERAGE : " + t);

        if (bonus > 0)
            System.out.println("BONUS MARKS : " + bonus);
    }


    void Calc() {

        for (int i = 0; i < 3; i++) {

            total[i] =
                assess1[i] * 20 / 100
                + assess2[i] * 20 / 100
                + cont_assess[i] * 20 / 100
                + end_sem[i] * 40 / 100;
        }
    }
}


// FULL TIME STUDENT
class FT extends Student {

    String sub[] = {"C++", "Java", "Python"};

    int assess1[] = new int[3];
    int cont_assess[] = new int[3];
    int end_sem[] = new int[3];
    int total[] = new int[3];

    int bonus;


    // Method Overriding
    @Override
    void getDetail(Scanner S) {

        super.getDetail(S);

        for (int i = 0; i < 3; i++) {

            System.out.println("\nENTER YOUR MARKS IN " + sub[i] + " :");

            cont_assess[i] = readValidMark(
                S,
                "Enter your Continuous Assessment mark : "
            );

            end_sem[i] = readValidMark(
                S,
                "Enter your End Sem mark : "
            );

            assess1[i] = readValidMark(
                S,
                "Enter your Assess 1 mark : "
            );
        }

        Calc();

        System.out.print("\nDo you want to add bonus marks? (Y/N): ");
        char choice = S.next().charAt(0);

        if (choice == 'Y' || choice == 'y') {

            while (true) {

                System.out.print("Enter bonus marks: ");
                bonus = S.nextInt();

                if (bonus >= 0 && bonus <= 100)
                    break;

                System.out.println(
                    "Invalid bonus! Please enter a value between 0 and 100."
                );
            }
        }
        else {
            bonus = 0;
        }
    }


    // Method Overriding
    @Override
    void display() {

        super.display();

        t = (total[0] + total[1] + total[2]) / 3;

        if (bonus > 0)
            CalcGrade(t, bonus);       // Overloaded method
        else
            CalcGrade(t);              // Original method

        for (int i = 0; i < 3; i++) {

            System.out.println("\nSUBJECT : " + sub[i]);
            System.out.println("Assess 1 mark : " + assess1[i]);
            System.out.println("Continuous Assessment mark : "
                               + cont_assess[i]);
            System.out.println("End Sem mark : " + end_sem[i]);
            System.out.println("TOTAL : " + total[i]);
        }

        System.out.println("\nAVERAGE : " + t);

        if (bonus > 0)
            System.out.println("BONUS MARKS : " + bonus);
    }


    void Calc() {

        for (int i = 0; i < 3; i++) {

            total[i] =
                assess1[i] * 20 / 100
                + cont_assess[i] * 40 / 100
                + end_sem[i] * 40 / 100;
        }
    }
}


// MAIN CLASS
public class markCalculation {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);


        // PART TIME STUDENT
        System.out.println("---------------------------------");
        System.out.println("           PART TIME");
        System.out.println("---------------------------------");

        PT stu1 = new PT();

        stu1.getDetail(S);

        System.out.println("\n----------------------------");
        System.out.println("           REPORT");
        System.out.println("----------------------------");

        stu1.display();
        stu1.gradePrint();


        // FULL TIME STUDENT
        System.out.println("\n---------------------------------");
        System.out.println("           FULL TIME");
        System.out.println("---------------------------------");

        FT stu2 = new FT();

        stu2.getDetail(S);

        System.out.println("\n----------------------------");
        System.out.println("           REPORT");
        System.out.println("----------------------------");

        stu2.display();
        stu2.gradePrint();


        S.close();
    }
}