package level2;
class Vehicle {

    String ownerName;
    String vehicleType;

    static int registrationFee = 5000;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println(ownerName);
        System.out.println(vehicleType);
        System.out.println(registrationFee);
    }

    static void updateRegistrationFee(int fee) {
        registrationFee = fee;
    }
}

public class VehicleRegistration {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Maha", "Car");
        Vehicle v2 = new Vehicle("Ravi", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(7000);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}



