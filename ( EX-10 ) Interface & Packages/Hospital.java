package hospital.main;

import java.util.Scanner;
import hospital.patient.Patient;
import hospital.doctor.Doctor;
import hospital.appointment.Appointment;
import hospital.billing.Billing;

public class Hospital {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Patient Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Disease: ");
        String disease = sc.nextLine();

        System.out.print("Doctor ID: ");
        int did = sc.nextInt();
        sc.nextLine();

        System.out.print("Doctor Name: ");
        String dname = sc.nextLine();

        System.out.print("Bill Amount: ");
        double amount = sc.nextDouble();

        Patient p = new Patient(id, name, age, disease);
        Doctor d = new Doctor(did, dname);

        System.out.println("\n");
        p.display();
        d.display();

        new Appointment().book(p, d);
        new Billing().generate(p, amount);

        sc.close();
    }
}