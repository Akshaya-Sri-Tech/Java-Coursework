class StudentObj {
    int id;

    StudentObj(int id) {
        this.id = id;
    }

    StudentObj(StudentObj s) {
        this.id = s.id;
    }
}

public class ObjectHandling {
    public static void main(String[] args) {
        // Question 1
        StudentObj s1 = new StudentObj(101);
        StudentObj s2 = new StudentObj(102);
        StudentObj s3 = new StudentObj(103);
        System.out.println("Q1 :");
        System.out.println("s1 HashCode :" + s1.hashCode());
        System.out.println("s2 HashCode :" + s2.hashCode());
        System.out.println("s3 HashCode :" + s3.hashCode());

        // Question 2
        StudentObj s4 = s1;
        System.out.println("Q2 :");
        System.out.println("s1 HashCode :" + s1.hashCode());
        System.out.println("s4 HashCode :" + s4.hashCode());

        // Question 3
        StudentObj s5 = new StudentObj(s1);
        System.out.println("Q3 :");
        System.out.println("s1 HashCode :" + s1.hashCode());
        System.out.println("s5 HashCode :" + s5.hashCode());

        // Question 4
        System.out.println("Q4 :");
        System.out.println("s1==s4 : " + (s1 == s4));
        System.out.println("s1.equals(s4) : " + s1.equals(s4));
    }
}