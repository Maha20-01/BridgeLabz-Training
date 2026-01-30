package objectorientedprogramming.encapsulation;

import java.util.*;

interface taxable {
    double calcTax();
    String taxInfo();
}

abstract class prod {
    private int prodId;
    private String prodName;
    private double price;

    prod(int prodId, String prodName, double price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    int getProdId() { return prodId; }
    void setProdId(int prodId) { this.prodId = prodId; }

    String getProdName() { return prodName; }
    void setProdName(String prodName) { this.prodName = prodName; }

    double getPrice() { return price; }
    void setPrice(double price) { this.price = price; }

    abstract double calcDisc();
}

class elec extends prod implements taxable {
    elec(int id, String n, double p) {
        super(id, n, p);
    }

    double calcDisc() {
        return getPrice() * 0.10;
    }

    public double calcTax() {
        return getPrice() * 0.18;
    }

    public String taxInfo() {
        return "GST 18%";
    }
}

class cloth extends prod implements taxable {
    cloth(int id, String n, double p) {
        super(id, n, p);
    }

    double calcDisc() {
        return getPrice() * 0.20;
    }

    public double calcTax() {
        return getPrice() * 0.05;
    }

    public String taxInfo() {
        return "GST 5%";
    }
}

class grocery extends prod {
    grocery(int id, String n, double p) {
        super(id, n, p);
    }

    double calcDisc() {
        return getPrice() * 0.05;
    }
}

public class ecommerce {
    static void finalAmt(List<prod> list) {
        for (prod p : list) {
            double tax = 0;
            if (p instanceof taxable)
                tax = ((taxable) p).calcTax();
            double total = p.getPrice() + tax - p.calcDisc();
            System.out.println(p.getProdName() + " " + total);
        }
    }

    public static void main(String[] args) {
        List<prod> list = new ArrayList<>();

        list.add(new elec(1, "Laptop", 60000));
        list.add(new cloth(2, "Shirt", 2000));
        list.add(new grocery(3, "Rice", 1200));

        finalAmt(list);
    }
}
