public class arithmeticDatatype {
    public static void main(String args[]) {

        byte b = 10;
        short s = 20;
        int i = 30;
        float f = 40.5f;
        double d = 50.25;

        // Addition
        System.out.println("byte + short = " + (b + s) + " (int)");
        System.out.println("int + float = " + (i + f) + " (float)");

        // Subtraction
        System.out.println("short - byte = " + (s - b) + " (int)");
        System.out.println("double - float = " + (d - f) + " (double)");

        // Multiplication
        System.out.println("byte * int = " + (b * i) + " (int)");
        System.out.println("float * double = " + (f * d) + " (double)");

        // Division
        System.out.println("int / short = " + (i / s) + " (int)");
        System.out.println("double / float = " + (d / f) + " (double)");

        // Modulus
        System.out.println("int % byte = " + (i % b) + " (int)");
        System.out.println("double % float = " + (d % f) + " (double)");
    }
}