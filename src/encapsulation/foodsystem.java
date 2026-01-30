package objectorientedprogramming.encapsulation;
import java.util.*;

interface discountable {
    double applyDisc();
    String discInfo();
}

abstract class fooditem {
    private String itemName;
    private double price;
    private int qty;

    fooditem(String itemName, double price, int qty) {
        this.itemName = itemName;
        this.price = price;
        this.qty = qty;
    }

    String getItemName() { return itemName; }
    double getPrice() { return price; }
    int getQty() { return qty; }

    abstract double total();

    void show() {
        System.out.println(itemName + " " + total());
    }
}

class vegitem extends fooditem implements discountable {
    vegitem(String n, double p, int q) {
        super(n, p, q);
    }

    double total() {
        return getPrice() * getQty();
    }

    public double applyDisc() {
        return total() * 0.10;
    }

    public String discInfo() {
        return "veg 10% off";
    }
}

class nonvegitem extends fooditem implements discountable {
    nonvegitem(String n, double p, int q) {
        super(n, p, q);
    }

    double total() {
        return (getPrice() * getQty()) + 50;
    }

    public double applyDisc() {
        return total() * 0.05;
    }

    public String discInfo() {
        return "nonveg 5% off";
    }
}

public class foodsystem {
    static void process(List<fooditem> list) {
        for (fooditem f : list) {
            double disc = 0;
            if (f instanceof discountable)
                disc = ((discountable) f).applyDisc();
            double amt = f.total() - disc;
            System.out.println(f.getItemName() + " " + amt);
        }
    }

    public static void main(String[] args) {
        List<fooditem> list = new ArrayList<>();

        list.add(new vegitem("Idli", 20, 5));
        list.add(new nonvegitem("Chicken", 180, 2));

        process(list);
    }
}
