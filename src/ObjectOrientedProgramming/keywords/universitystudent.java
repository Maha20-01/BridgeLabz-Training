package ObjectOrientedProgramming.keywords;

public class universitystudent {
    static String uni = "ABC University";
    static int total = 0;

    final int roll;
    String name;
    char grade;

    universitystudent(int roll, String name, char grade) {
        this.roll = roll;
        this.name = name;
        this.grade = grade;
        total++;
    }

    static void displayTotalStudents() {
        System.out.println(total);
    }

    void show(Object o) {
        if (o instanceof universitystudent) {
            universitystudent s = (universitystudent) o;
            System.out.println(uni);
            System.out.println(s.roll);
            System.out.println(s.name);
            System.out.println(s.grade);
        }
    }

    public static void main(String[] args) {
        universitystudent s1 = new universitystudent(1, "Ram", 'A');
        universitystudent s2 = new universitystudent(2, "Sita", 'B');

        s1.show(s1);
        displayTotalStudents();
    }
}
