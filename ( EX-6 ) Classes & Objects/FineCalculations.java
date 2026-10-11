import java.util.Scanner;

class LibraryRecord
{
    int id, overdue_days, fine;
    String category;

    LibraryRecord() {
        id = 0;
        category = " ";
        overdue_days = 0;
        fine = 0;
    }

    LibraryRecord(int id, String category, int days) {
        this.id = id;
        this.category = category;

        if(days < 0)
            overdue_days = 0;
        else
            overdue_days = days;

        fine = 0;
        calculateFine(overdue_days);
    }

    void getDetails() {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter the Category : ");
        category = S.nextLine();

        System.out.print("Enter the Library ID : ");
        id = S.nextInt();

        System.out.print("Enter the overdue days : ");
        overdue_days = S.nextInt();

        if(overdue_days < 0) {
            overdue_days = 0;
            System.out.println("This parameter cannot be negative, hence taken as 0");
        }

        calculateFine(overdue_days);
                S.close();
    }

    void calculateFine(int days) {

        fine = 0;

        int temp = days;
        int count = 0;

        switch(category) {

            case "UG": {
                while(temp > 0) {
                    temp--;
                    count++;

                    if(count > 15 && count <= 25)
                        fine += 5;
                    else if(count > 25 && count <= 40)
                        fine += 10;
                    else if(count > 40)
                        fine += 15;
                }
                break;
            }

            case "PG": {
                while(temp > 0) {
                    temp--;
                    count++;

                    if(count > 30 && count <= 60)
                        fine += 10;
                    else if(count > 60)
                        fine += 15;
                }
                break;
            }

            case "Research Scholars": {
                while(temp > 0) {
                    temp--;
                    count++;

                    if(count > 60 && count <= 90)
                        fine += 10;
                    else if(count > 90)
                        fine += 15;
                }
                break;
            }

            case "Faculty": {
                while(temp > 0) {
                    temp--;
                    count++;

                    if(count > 180)
                        fine += 15;
                }
                break;
            }

            default:
                System.out.println("Invalid Category");
        }
    }

    void print() {
        System.out.println("Library ID : " + id);
        System.out.println("Your Category : " + category);
        System.out.println("Overdue_days : " + overdue_days);
        System.out.println("FINE : " + fine);
    }
}

public class FineCalculations {

    public static void main(String[] args) {

        LibraryRecord l1 = new LibraryRecord(101, "UG", 20);

        LibraryRecord l2[] = new LibraryRecord[2];

        for(int i = 0; i < 2; i++) {
            l2[i] = new LibraryRecord();
            System.out.println("\nEnter Person " + (i + 1) + " :");
            l2[i].getDetails();
        }


	System.out.println("----------------------------------");
	System.out.println("         FINE CALCULATIONS        ");
	System.out.println("----------------------------------");
        System.out.println("\nPerson 1 :");
        l1.print();

        for(int i = 0; i < 2; i++) {
            System.out.println("\nPerson " + (i + 2) + " :");
            l2[i].print();
        }
    }
}