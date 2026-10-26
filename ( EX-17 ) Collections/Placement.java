import java.util.List;
import java.util.TreeSet;

public class Placement{
    public static void main(String[] args) {
        List<Integer> marks = List.of(34,56,76,87,45,87,56,79,78,97,76,56,87,56);
        TreeSet<Integer> distinct = new TreeSet<>(marks);

        System.out.println("All Marks        : "+ marks);
        System.out.println("Distinct         : "+ distinct);
        System.out.println("Lowest           : "+ distinct.first());
        System.out.println("highest          : "+ distinct.last());
        System.out.println("Descending Order : "+ distinct.descendingSet());
        System.out.println("Above 75         : "+ distinct.tailSet(75,true));
        System.out.println("Below 75         : "+ distinct.headSet(75));
        System.out.println("Lowest pass      : "+ distinct.ceiling(40));
    }
}