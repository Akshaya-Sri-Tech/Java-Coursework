public class intCast{
    public static void main(String args[]) {
        int a = 300;

        byte b = (byte)a;
        short s = (short)a;
        char c = (char)a;

        System.out.println("Integer : " + a);
        System.out.println("Byte : " + b);
        System.out.println("Short : " + s);
        System.out.println("Char : " + c);
    }
}