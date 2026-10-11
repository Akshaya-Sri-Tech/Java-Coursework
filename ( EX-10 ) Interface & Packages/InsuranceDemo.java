interface InsurancePolicy {
    double getPremium();
    double getCoverage();

    default void verify() {
        System.out.println("Policy verified");
        authenticate();
    }

    private void authenticate() {
        System.out.println("Customer authentication successful");
    }

    default void showDetails() {
        System.out.println("Premium: " + getPremium());
        System.out.println("Coverage: " + getCoverage());
    }
}

interface Claimable {
    boolean canClaim();
}

class MedicalInsurance implements InsurancePolicy, Claimable {

    public double getPremium() {
        return 6000;
    }

    public double getCoverage() {
        return 120000;
    }

    public boolean canClaim() {
        return getCoverage() > 0;
    }
}

class AutoInsurance implements InsurancePolicy, Claimable {

    public double getPremium() {
        return 3500;
    }

    public double getCoverage() {
        return 80000;
    }

    public boolean canClaim() {
        return getPremium() < 5000;
    }
}

public class InsuranceDemo {
    public static void main(String[] args) {

        InsurancePolicy policy;

        System.out.println("=== Medical Policy ===");
        policy = new MedicalInsurance();
        policy.showDetails();
        policy.verify();

        System.out.println("\n=== Auto Policy ===");
        policy = new AutoInsurance();
        policy.showDetails();
        policy.verify();

        Claimable claim = new AutoInsurance();
        System.out.println("\nClaim Status: " + claim.canClaim());
    }
}