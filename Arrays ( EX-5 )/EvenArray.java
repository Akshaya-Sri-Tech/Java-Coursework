import java.util.Scanner;
public class EvenArray {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter array 1 and array 2 sizes:");
        int s1 = S.nextInt();
        int s2 = S.nextInt();
        int arr1[] = new int[s1];
        int arr2[] = new int[s2];

        System.out.println("Enter array 1 elements:");
        for (int i = 0; i < s1; i++)
            arr1[i] = S.nextInt();

        System.out.println("Enter array 2 elements:");
        for (int i = 0; i < s2; i++)
            arr2[i] = S.nextInt();

        int evenArray[] = new int[s1 + s2];
        int size = 0;
        for (int i = 0; i < s1; i++) {
            if (arr1[i] % 2 == 0)
                if(arr1[i]!=0)
                    evenArray[size++] = arr1[i];
        }

        for (int i = 0; i < s2; i++) {
            if (arr2[i] % 2 == 0)
                if(arr2[i]!=0)
                    evenArray[size++] = arr2[i];
        }

        System.out.println("Even Array:");
        for (int i = 0; i < size; i++)
            System.out.print(evenArray[i] + " ");
                S.close();
    }
}