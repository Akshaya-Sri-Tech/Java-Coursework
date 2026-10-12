import java.io.*;

class AppendFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Sample.txt", true);
        // if "false" overwrites , By default it is false.
        fw.write("\nNew content appended");
        fw.close();

        System.out.println("Content appended successfully");
    }
}