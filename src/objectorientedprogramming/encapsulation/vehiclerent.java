package objectorientedprogramming.encapsulation;

import java.util.*;

interface insurable {
    double calcIns();
    String insInfo();
}

abstract class vehicle {
    private String vehNo;
    private String vehType;
    private double rentRate;
    private String insNo;

    vehicle(String vehNo, String vehType, double rentRate) {
        this.vehNo = vehNo;
        this.vehType = vehType;
        this.rentRate = rentRate;
    }

    String getVehNo() { return vehNo; }
    void setVehNo(String vehNo) { this.vehNo = vehNo; }

    String getVehType() { return vehType; }
    void setVehType(String vehType) { this.vehType = vehType; }

    double getRentRate() { return rentRate; }
    void setRentRate(double rentRate) { this.rentRate = rentRate; }

    void setInsNo(String insNo) { this.insNo = insNo; }

    abstract double calcRent(int days);
}

class car extends vehicle implements insurable {
    car(String no, double rate) {
        super(no, "car", rate);
    }

    double calcRent(int days) {
        return getRentRate() * days;
    }

    public double calcIns() {
        return 500;
    }

    public String insInfo() {
        return "car insurance";
    }
}

class bike extends vehicle implements insurable {
    bike(String no, double rate) {
        super(no, "bike", rate);
    }

    double calcRent(int days) {
        return getRentRate() * days * 0.8;
    }

    public double calcIns() {
        return 200;
    }

    public String insInfo() {
        return "bike insurance";
    }
}

class truck extends vehicle implements insurable {
    truck(String no, double rate) {
        super(no, "truck", rate);
    }

    double calcRent(int days) {
        return getRentRate() * days * 1.5;
    }

    public double calcIns() {
        return 1000;
    }

    public String insInfo() {
        return "truck insurance";
    }
}

public class vehiclerent {
    public static void main(String[] args) {
        List<vehicle> list = new ArrayList<>();

        list.add(new car("TN01A1", 2000));
        list.add(new bike("TN02B2", 800));
        list.add(new truck("TN03C3", 5000));

        int days = 3;

        for (vehicle v : list) {
            double rent = v.calcRent(days);
            double ins = ((insurable) v).calcIns();
            System.out.println(v.getVehType() + " " + rent + " " + ins);
        }
    }
}
