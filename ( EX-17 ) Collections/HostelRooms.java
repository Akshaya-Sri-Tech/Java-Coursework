
import java.util.Hashtable;

public class HostelRooms{
    public static void main(String[] args) {
        Hashtable<Integer,String> rooms = new Hashtable<>();
        rooms.put(101,"Ram"); rooms.put(102,"Sam");
        allocate(rooms,103,"Dam"); allocate(rooms,102,"Jam");
        System.out.println("Rooms : "+rooms);    
        rooms.remove(102);
        System.out.println("Rooms After 102 Vacates : "+rooms);
        try {
            rooms.put(104,null);
        } catch (NullPointerException e) {
            System.out.println("Room cannot be allocated for NULL");
        }
    }
    static void allocate(Hashtable<Integer,String> r,int no, String name){
        if(r.get(no) != null ){
            System.out.println("Room Taken by : "+ r.get(no));
        }
        else{
            r.put(no,name);
        }
    }
}