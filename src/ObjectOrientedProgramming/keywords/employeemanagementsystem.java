package ObjectOrientedProgramming.keywords;

public class employeemanagementsystem {
    static String comp = "TechCorp";
    static int total = 0;

    final int id;
    String name;
    String des;

    employeemanagementsystem(int id, String name, String des) {
        this.id = id;
        this.name = name;
        this.des = des;
        total++;
    }

    static void displayTotalEmployees() {
        System.out.println(total);
    }

    void show(Object o) {
        if (o instanceof employeemanagementsystem) {
            employeemanagementsystem e = (employeemanagementsystem) o;
            System.out.println(comp);
            System.out.println(e.id);
            System.out.println(e.name);
            System.out.println(e.des);
        }
    }
    public static void main(String[] args) {
        employeemanagementsystem e1 = new employeemanagementsystem(1, "Ram", "Dev");
        employeemanagementsystem e2 = new employeemanagementsystem(2, "Sita", "Tester");

        e1.show(e1);
        displayTotalEmployees();
    }
}
