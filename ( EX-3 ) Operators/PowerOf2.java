public class PowerOf2 {
    public static void main(String[] args) {
        int num = 15;
        if ( num > 0 &&(num & (num - 1)) == 0) {
            System.out.println(num + " is a power of 2.");
        } else {
            System.out.println(num + " is not a power of 2.");
        }
    }
}
