package ObjectOrientedProgramming.keywords;

public class hospitalmanage {
    static String hosp = "City Hospital";
    static int total = 0;
    final int pid;
    String name;
    int age;
    String ail;

    hospitalmanage(int pid, String name, int age, String ail) {
        this.pid = pid;
        this.name = name;
        this.age = age;
        this.ail = ail;
        total++;
    }

    static void getTotalPatients() {
        System.out.println(total);
    }

    void show(Object o) {
        if (o instanceof hospitalmanage) {
            hospitalmanage p = (hospitalmanage) o;
            System.out.println(hosp);
            System.out.println(p.pid);
            System.out.println(p.name);
            System.out.println(p.age);
            System.out.println(p.ail);
        }
    }

    public static void main(String[] args) {
        hospitalmanage p1 = new hospitalmanage(1, "Ramu", 30, "Fever");
        hospitalmanage p2 = new hospitalmanage(2, "Sita", 25, "Cold");

        p1.show(p1);
        getTotalPatients();
    }
}