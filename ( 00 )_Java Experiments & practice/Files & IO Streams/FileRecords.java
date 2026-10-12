import java.io.*;
import java.util.Scanner;

class FileRecords {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("records.txt");

        //Write
        System.out.print("Enter a record: ");
        fw.write(sc.nextLine() + "\n"); // Eg : AK,ID-101,Chennai
        fw.close();

        //Append
        fw = new FileWriter("records.txt", true);
        System.out.print("Enter another record: ");
        fw.write(sc.nextLine() + "\n");
        fw.close();

        sc.close();
        
        //Read
        BufferedReader br = new BufferedReader(new FileReader("records.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            for (String s : data)
                System.out.println(s.trim());
        }
        br.close();
    }
}

