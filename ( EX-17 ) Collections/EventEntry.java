import java.util.HashSet;
import java.util.Set;
public class EventEntry{
    public static void main(String[] args) {
        String people[]={"S101","S103","S104","S101","S102","S103"};
        Set<String> scans = new HashSet<>();
        for( String name : people ){
            if(!scans.add(name)) System.out.println("Repeated Scan : "+name);
        }
        System.err.println("Unique Visiters : "+scans.size());

        // Two clubs : Java,Python
        Set<String> Java = Set.of("Sam","Dam","Ram","Priya","Riya");
        Set<String> Python = Set.of("Sam","Ram","Riya","Pia","Sia");

        Set<String> MemberInBoth = new HashSet<>(Java);
        MemberInBoth.retainAll(Python);

        Set<String> MemberInAny = new HashSet<>(Java);
        MemberInAny.addAll(Python);

        System.out.println("Members in Both Clubs : "+ MemberInBoth);
        System.out.println("Members in Any Club : "+ MemberInAny);

    }
}