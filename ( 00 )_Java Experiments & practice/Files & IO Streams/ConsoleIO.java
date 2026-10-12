import java.io.*; 
public class ConsoleIO {
    public static void main(String[] args) {
        try {
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a String :");
            String input=bf.readLine();
            System.out.println(input);
            bf.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
            bf.write("Hello World");
            bf.newLine();
            bf.write("I am doing java");
            bf.close();//Calling close() automatically flushes the internal memory buffer,
            //forcing the stored characters to be pushed out to the console screen.
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
