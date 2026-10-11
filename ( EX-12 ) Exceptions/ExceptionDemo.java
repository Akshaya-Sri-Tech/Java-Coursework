import java.io.*;

class ExceptionDemo {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("abc.txt"); // IOException
            f.close();
        } catch (IOException e) {
            System.out.println("Checked: IOException");
        }
        try {
            Class.forName("ABC"); // ClassNotFoundException
        } catch (ClassNotFoundException e) {
            System.out.println("Checked: ClassNotFoundException");
        }
        try {
            throw new ArithmeticException(); // simulate ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Unchecked: ArithmeticException");
        }
    }
}