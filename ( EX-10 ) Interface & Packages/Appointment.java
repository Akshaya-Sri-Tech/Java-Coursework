package hospital.appointment;

import hospital.patient.Patient;
import hospital.doctor.Doctor;

public class Appointment {

    public void book(Patient p, Doctor d) {
        System.out.println("\nAppointment Details");
        System.out.println("Patient: " + p.getName());
        System.out.println("Doctor: " + d.getName());
        System.out.println("Appointment Booked");
    }
}