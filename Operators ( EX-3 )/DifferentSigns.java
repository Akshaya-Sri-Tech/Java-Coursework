public class DifferentSigns {
    public static void main(String[] args) {
        int a = 5, b = -10;
        if ((a ^ b) < 0) {
            System.out.println("Different signs");
        } else {
            System.out.println("Same signs");
        }
    }
}
