/*Copy File with Statistics
Write a Java program to copy the contents of one text file into another.
While copying, count the number of lines, words, and characters.
Display the statistics after copying.*/
import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("source.txt"));
            FileWriter writer = new FileWriter("destination.txt");

            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();

                writer.write(line + "\n");

                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            reader.close();
            writer.close();

            System.out.println("File copied successfully.");
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters: " + charCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
