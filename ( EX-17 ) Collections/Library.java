import java.util.*;
public class Library{
    public static void main(String args[]){
        String[] log = {"Java book", "DBMS book", "DSD book","Java book", "DBMS book", "DSD book","Java book","Python book"};
        Map<String,Integer> freq = new HashMap<>();
        for(String book : log){
            freq.put(book,freq.getOrDefault(book,0)+1);
        }
        System.out.println("BOOKS FROM LOG : "+ freq);
        String top=null;
        for(Map.Entry<String,Integer> e : freq.entrySet()){
            if(e.getValue()>1) System.out.println("POPULAR : "+ e);
            if(top==null || e.getValue()>freq.get(top)) top=e.getKey(); 
        }
        System.out.println("MOST BORROWED : " + top);
        System.out.println("Is DSD book in the log : " + freq.containsKey("DSD book"));
    }
}
