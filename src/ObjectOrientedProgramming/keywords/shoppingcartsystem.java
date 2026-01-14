package ObjectOrientedProgramming.keywords;

public class shoppingcartsystem {
    static double dis = 10.0;

    final int pid;
    String name;
    double price;
    int qty;
    shoppingcartsystem(int pid, String name, double price, int qty) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    static void updateDiscount(double d) {
        dis = d;
    }
    void show(Object o) {
        if (o instanceof shoppingcartsystem) {
            shoppingcartsystem p = (shoppingcartsystem) o;
            System.out.println(p.pid);
            System.out.println(p.name);
            System.out.println(p.price);
            System.out.println(p.qty);
            System.out.println(dis);
        }
    }
    public static void main(String[] args) {
        shoppingcartsystem p1 = new shoppingcartsystem(101, "Pen", 10.5, 5);
        updateDiscount(15.0);
        p1.show(p1);
    }
}
