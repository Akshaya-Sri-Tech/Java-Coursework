import java.util.*;
abstract class Vehicle {
    static int totalVehicles = 0;
    static final String NAME = "ABC TOLL GATE";
    static final int MAINTENANCE = 50;
    final int regNo;
    Vehicle(int regNo) {
        this.regNo = regNo;
        totalVehicles++;
    }
    abstract int getToll();
    void display() {
    System.out.println("Vehicle Number : " + regNo);
    System.out.println("Toll Fee : " + (MAINTENANCE + getToll()));
}
}
class Car extends Vehicle {
    static int count = 0, total = 0;
    final int TOLL = 100;
    Car(int n) {
        super(n);
        count++;
        total += MAINTENANCE + TOLL;
    }
    int getToll() { return TOLL; }
    static void show() {
        System.out.println("Cars : " + count + "  Collection : " + total);
    }
}
class Bus extends Vehicle {
    static int count = 0, total = 0;
    final int TOLL = 150;
    Bus(int n) {
        super(n);
        count++;
        total += MAINTENANCE + TOLL;
    }
    int getToll() { return TOLL; }
    static void show() {
        System.out.println("Buses : " + count + "  Collection : " + total);
    }
}
class Truck extends Vehicle {
    static int count = 0, total = 0;
    final int TOLL = 200;
    Truck(int n) {
        super(n);
        count++;
        total += MAINTENANCE + TOLL;
    }
    int getToll() { return TOLL; }
    static void show() {
        System.out.println("Trucks : " + count + "  Collection : " + total);
    }
}
public class TollGate {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println(Vehicle.NAME);
        System.out.print("Cars : ");
        int n = S.nextInt();
        for(int i=0;i<n;i++){
            Vehicle v = new Car(S.nextInt());
            v.display();
        }
        System.out.print("Buses : ");
        n = S.nextInt();
        for(int i=0;i<n;i++){
        Vehicle v = new Bus(S.nextInt());
            v.display();
        }
        System.out.print("Trucks : ");
        n = S.nextInt();
        for(int i=0;i<n;i++){
            Vehicle v = new Truck(S.nextInt());
            v.display();
        }
        System.out.println("\nTotal Vehicles : " + Vehicle.totalVehicles);
        Car.show();
        Bus.show();
        Truck.show();
        System.out.println("Grand Total : " +
                (Car.total + Bus.total + Truck.total));
        S.close();
    }
}