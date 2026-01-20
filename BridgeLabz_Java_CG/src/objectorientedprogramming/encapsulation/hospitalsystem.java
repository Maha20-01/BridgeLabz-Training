package objectorientedprogramming.encapsulation;
import java.util.*;

interface medrec {
    void addRec(String r);
    void viewRec();
}

abstract class patient {
    private int pid;
    private String name;
    private int age;
    private String diag;

    patient(int pid, String name, int age) {
        this.pid = pid;
        this.name = name;
        this.age = age;
    }

    int getPid() { return pid; }
    String getName() { return name; }
    int getAge() { return age; }

    void setDiag(String diag) { this.diag = diag; }

    abstract double calcBill();

    void show() {
        System.out.println(pid + " " + name + " " + calcBill());
    }
}

class inpatient extends patient implements medrec {
    private int days;
    private List<String> rec = new ArrayList<>();

    inpatient(int id, String n, int a, int d) {
        super(id, n, a);
        this.days = d;
    }

    double calcBill() {
        return days * 3000;
    }

    public void addRec(String r) {
        rec.add(r);
    }

    public void viewRec() {
        for (String r : rec)
            System.out.println(r);
    }
}

class outpatient extends patient implements medrec {
    private double fee;
    private List<String> rec = new ArrayList<>();

    outpatient(int id, String n, int a, double f) {
        super(id, n, a);
        this.fee = f;
    }

    double calcBill() {
        return fee;
    }

    public void addRec(String r) {
        rec.add(r);
    }

    public void viewRec() {
        for (String r : rec)
            System.out.println(r);
    }
}

public class hospitalsystem {
    public static void main(String[] args) {
        List<patient> list = new ArrayList<>();

        patient p1 = new inpatient(1, "Ravi", 45, 5);
        patient p2 = new outpatient(2, "Anu", 30, 800);

        list.add(p1);
        list.add(p2);

        for (patient p : list)
            p.show();
    }
}
