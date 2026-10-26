import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ReportCard{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        TreeMap<String,Integer> marks = new TreeMap<>();
        marks.put("Ram",60); marks.put("Sam",70); marks.put("Dam",45);
        marks.put("Jam",65); marks.put("Priya",90);
        marks.put("Riya",95); marks.put("Pia",78);

        String topper = marks.firstKey();
        for(Map.Entry<String,Integer> e : marks.entrySet()){
            System.out.print(e.getKey() +" : "+e.getValue()+" , ");
            if(e.getValue()>marks.get(topper)) topper=e.getKey();
        }
        System.out.println("TOPPER : "+ topper);

        System.out.println("Enter Name and Updated mark : ");
        String name=S.nextLine();
        int m=S.nextInt();
        marks.put(name,m);
        for(Map.Entry<String,Integer> e : marks.entrySet()){
            System.out.print(e.getKey() +" : "+e.getValue()+" , ");
            if(e.getValue()>marks.get(topper)) topper=e.getKey();
        }
        System.out.println("TOPPER : "+ topper);
    }
}