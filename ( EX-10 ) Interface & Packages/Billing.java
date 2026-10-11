package hospital.billing;

import hospital.patient.Patient;

public class Billing {

    public void generate(Patient p, double amount) {
        System.out.println("\nBilling Details");
        System.out.println("Patient: " + p.getName());
        System.out.println("Amount: Rs." + amount);
    }
}