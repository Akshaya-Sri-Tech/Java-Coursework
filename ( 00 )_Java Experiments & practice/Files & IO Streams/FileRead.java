import java.io.*;

public class FileRead{
    public static void main(String[] args) {
        try {
            FileInputStream in=new FileInputStream("sample1.txt");
            int data;
            while((data=in.read())!=-1){
                System.out.print(((char)data)); 
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader bf=new BufferedReader(new FileReader("sample2.txt"));
            String line;
            System.out.println();
            while((line=bf.readLine())!=null){
                System.out.println(line);
            }
            bf.close();
        } catch (IOException e) {
        }
    }
}