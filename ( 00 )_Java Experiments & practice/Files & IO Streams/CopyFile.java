
import java.io.*;

class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("Sample.txt");
        FileOutputStream fout = new FileOutputStream("Copy.txt");

        int ch;
        while ((ch = fin.read()) != -1)
            fout.write(ch);

        fin.close();
        fout.close();

        System.out.println("File copied successfully");
    }
}

