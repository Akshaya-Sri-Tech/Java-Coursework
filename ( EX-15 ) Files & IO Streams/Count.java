/*Read a text file using Java I/O.
Count:
Number of characters
Number of words
Number of lines
Number of vowels
Store the results in a separate file. */

import java.io.*;

public class Count {
    public static void main(String[] args) {
        try {
            int ch=0,w=0,l=0,v=0;
            FileInputStream in=new FileInputStream("sample.txt");
            int data;
            
            while((data=in.read())!=-1){
                char c = (char)data; 
                ch++;                 
                if(c==' ' || c=='\n') w++; 
                if(c=='\n') l++;
                if(c=='a' || c=='o' || c=='i' || c=='e' || c=='u' ||
                   c=='A' || c=='O' || c=='I' || c=='E' || c=='U' )
                       v++;
            }
            in.close();
            
            if (ch > 0) { w++; l++; }
            
            FileWriter out = new FileWriter("results.txt");
            out.write("Characters: " + ch + "\n");
            out.write("Words: " + w + "\n");
            out.write("Lines: " + l + "\n");
            out.write("Vowels: " + v + "\n");
            out.close(); 
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
