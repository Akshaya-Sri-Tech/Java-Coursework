//Count number of words, letters, characters, lines, numbers , vowels in the Sample.txt file

import java.io.*;
public class CountingStats{
    public static void main(String[] args) {
        try{
            BufferedReader bf=new BufferedReader(new FileReader("Sample.txt"));
            int words=0,letters=0,characters=0,lines=0,numbers=0,vowels=0;
            String line;
            while((line=bf.readLine())!=null){
                lines++;
                characters += line.length();

                String w[]=line.trim().split("\\s+");
                if(!line.trim().isEmpty()){
                    words += w.length;
                }

                for(int i=0;i<line.length();i++){
                    char ch= line.charAt(i);
                    if(Character.isLetter(ch)){
                        letters++;
                        if("aeiouAEIOU".indexOf(ch)!=-1)
                            vowels++;
                    }
                    if(Character.isDigit(ch))
                        numbers++;
                }
            }
            bf.close();

            System.out.println("Letters: " + letters);
            System.out.println("Characters: " + characters);
            System.out.println("Words: " + words);
            System.out.println("Lines: " + lines);
            System.out.println("Vowels: " + vowels);
            System.out.println("Numbers: " + numbers);

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}