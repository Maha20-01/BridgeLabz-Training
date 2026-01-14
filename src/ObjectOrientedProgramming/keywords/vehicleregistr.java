package ObjectOrientedProgramming.keywords;

public class vehicleregistr {
    static double fee = 500.0;
    final String reg;
    String owner;
    String type;

    vehicleregistr(String reg, String owner, String type) {
        this.reg = reg;
        this.owner = owner;
        this.type = type;
    }
    static void updateRegistrationFee(double f) {
        fee = f;
    }
    void show(Object o) {
        if (o instanceof vehicleregistr) {
            vehicleregistr v = (vehicleregistr) o;
            System.out.println(v.reg);
            System.out.println(v.owner);
            System.out.println(v.type);
            System.out.println(fee);
        }
    }

    public static void main(String[] args) {
        vehicleregistr v1 = new vehicleregistr("TN01AB1234", "Ravi", "Car");
        updateRegistrationFee(750.0);
        v1.show(v1);
    }
}
