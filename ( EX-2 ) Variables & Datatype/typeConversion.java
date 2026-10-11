public class typeConversion{
    public static void main(String args[]){

        byte b=126;
        int a=b;
        System.out.println("byte -> int : " + a + " (Implicit)");

        int x=126;
        float c=x;
        System.out.println("int -> float : " + c + " (Implicit)");

        double h=c;
        System.out.println("float -> double : " + h + " (Implicit)");

        double d=0.23;
        int e=(int)d;
        System.out.println("double -> int : " + e + " (Explicit)");

        int n=65;
        char f=(char)n;
        System.out.println("int -> char : " + f + " (Explicit)");
    }
}