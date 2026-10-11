import java.util.*;

class InvalidHeightException extends Exception {
    InvalidHeightException(String s) {
        super(s);
    }
}

class RainWater {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try {
                System.out.print("Enter size: ");
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                    if (a[i] < 0)
                        throw new InvalidHeightException("Invalid height");
                }
                System.out.println("Water = " + water(a));
                System.out.println(a[n]); // ArrayIndexOutOfBounds
            } catch (NegativeArraySizeException e) {
                System.out.println("Negative size");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
            } catch (InvalidHeightException e) {
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index out of bounds");
            }
        }
    }

    static int water(int[] a) {
        int w = 0, l = 0, r = a.length - 1, ml = 0, mr = 0;
        while (l < r) {
            if (a[l] < a[r]) {
                ml = Math.max(ml, a[l]);
                w += ml - a[l++];
            } else {
                mr = Math.max(mr, a[r]);
                w += mr - a[r--];
            }
        }
        return w;
    }
}