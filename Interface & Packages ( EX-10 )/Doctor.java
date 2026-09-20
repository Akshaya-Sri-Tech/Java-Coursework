package hospital.doctor;

public class Doctor {
    private int id;
    private String name;

    public Doctor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Doctor ID: " + id);
        System.out.println("Doctor: " + name);
    }
}