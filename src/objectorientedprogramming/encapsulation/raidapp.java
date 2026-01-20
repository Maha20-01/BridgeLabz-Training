package objectorientedprogramming.encapsulation;

import java.util.*;

interface gps {
    String getLoc();
    void setLoc(String loc);
}

abstract class vehicle1 {
    private int vid;
    private String drv;
    private double rate;

    vehicle1(int vid, String drv, double rate) {
        this.vid = vid;
        this.drv = drv;
        this.rate = rate;
    }

    int getVid() { return vid; }
    String getDrv() { return drv; }
    double getRate() { return rate; }

    abstract double calcFare(double km);

    void show() {
        System.out.println(vid + " " + drv);
    }
}

class car1 extends vehicle1 implements gps {
    private String loc;

    car1(int id, String d, double r) {
        super(id, d, r);
    }

    double calcFare(double km) {
        return km * getRate();
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}

class bike1 extends vehicle1 implements gps {
    private String loc;

    bike1(int id, String d, double r) {
        super(id, d, r);
    }

    double calcFare(double km) {
        return km * getRate() * 0.7;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}

class auto extends vehicle1 implements gps {
    private String loc;

    auto(int id, String d, double r) {
        super(id, d, r);
    }

    double calcFare(double km) {
        return km * getRate() * 0.85;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}

public class raidapp {
    static void fareCalc(List<vehicle1> list, double km) {
        for (vehicle1 v : list)
            System.out.println(v.calcFare(km));
    }

    public static void main(String[] args) {
        List<vehicle1> list = new ArrayList<>();

        list.add(new car1(1, "Amit", 15));
        list.add(new bike1(2, "Ravi", 10));
        list.add(new auto(3, "Suresh", 12));

        fareCalc(list, 10);
    }
}
