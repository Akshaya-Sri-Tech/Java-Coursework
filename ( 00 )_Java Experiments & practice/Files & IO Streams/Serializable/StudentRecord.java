import java.io.*;
import java.util.*;

class Student implements Serializable {
    int rollNo;
    String name;
    int marks;
    transient char grade;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        grade = findGrade(marks);
    }

    public static char findGrade(int marks) {
        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else return 'D';
    }
}

public class StudentRecord {

    public void AppendRecord(Student s) throws Exception {
        ObjectOutputStream out = new ObjectOutputStream(
            new FileOutputStream("student.dat", true));
        out.writeObject(s);
        out.close();
    }

    public void displayRecord() throws Exception {
        ObjectInputStream in = new ObjectInputStream(
            new FileInputStream("student.dat"));

        Student s;
        try {
            while (true) {
                s = (Student) in.readObject();
                System.out.println("Name : " + s.name);
                System.out.println("RegNo: " + s.rollNo);
                System.out.println("Marks : " + s.marks);
                System.out.println("Grade : " + Student.findGrade(s.marks));
            }
        } catch (EOFException e) {
        }
        in.close();
    }

    public void SearchRecord(int rno) throws Exception {
        ObjectInputStream in = new ObjectInputStream(
            new FileInputStream("student.dat"));

        Student s;
        try {
            while (true) {
                s = (Student) in.readObject();
                if (s.rollNo == rno) {
                    System.out.println("FOUND");
                    System.out.println("Name : " + s.name);
                    in.close();
                    return;
                }
            }
        } catch (EOFException e) {
        }
        in.close();
        System.out.println("Not Found");
    }

    public void UpdateRecord(int old, int newMarks) throws Exception {
        List<Student> list = new ArrayList<>();
        ObjectInputStream in = new ObjectInputStream(
            new FileInputStream("student.dat"));

        Student s;
        try {
            while (true) {
                s = (Student) in.readObject();
                if (s.marks == old) s.marks = newMarks;
                list.add(s);
            }
        } catch (EOFException e) {
        }
        in.close();

        ObjectOutputStream out = new ObjectOutputStream(
            new FileOutputStream("student.dat"));

        for (Student s1 : list) {
            out.writeObject(s1);
        }
        out.close();
    }

    public static void main(String[] args) throws Exception {
        StudentRecord obj = new StudentRecord();

        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("1. Append Record");
            System.out.println("2. Display Record");
            System.out.println("3. Search Record");
            System.out.println("4. Update Record");
            System.out.println("5. Exit");
            System.out.print("Enter Choice : ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    Student st = new Student(101, "Arun", 95);
                    obj.AppendRecord(st);
                    System.out.println("Record Appended");
                    break;

                case 2:
                    obj.displayRecord();
                    break;

                case 3:
                    System.out.print("Enter Roll No: ");
                    int rno = s.nextInt();
                    obj.SearchRecord(rno);
                    break;

                case 4:
                    System.out.print("Enter Old Marks: ");
                    int old = s.nextInt();
                    System.out.print("Enter New Marks: ");
                    int newMarks = s.nextInt();
                    obj.UpdateRecord(old, newMarks);
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}