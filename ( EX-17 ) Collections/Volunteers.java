import java.util.*;
public class Volunteers{
    public static void main(String args[]){
        List<String> names=new ArrayList<>(List.of("Akshaya","Nandini","Tryphena","Nandini","Tryphena"));
        System.out.println("BEFORE : "+ names);


        List<String> repeated=new ArrayList<>();
        for( String name : names ){
            if((Collections.frequency(names,name)>1) && !repeated.contains(name))
                repeated.add(name);
        }
        System.out.println("REPEATED NAMES : : "+ repeated);


        List<String> seen = new ArrayList<>();
        Iterator<String> it = names.iterator();
        while( it.hasNext() ){
            String name = it.next();
            if(seen.contains(name))
                it.remove();
            else 
                seen.add(name);
        }
        System.out.println("AFTER : "+ names);
    }
}
