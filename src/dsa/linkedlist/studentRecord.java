package linkedlist;

class studentRecord {

    static class Node {
        int roll, age;
        String name, grade;
        Node next;

        Node(int r, String n, int a, String g) {
            roll = r;
            name = n;
            age = a;
            grade = g;
            next = null;
        }
    }

    Node head;

    void addFirst(int r, String n, int a, String g) {
        Node nn = new Node(r, n, a, g);
        nn.next = head;
        head = nn;
    }

    void addLast(int r, String n, int a, String g) {
        Node nn = new Node(r, n, a, g);
        if (head == null) {
            head = nn;
            return;
        }
        Node t = head;
        while (t.next != null)
            t = t.next;
        t.next = nn;
    }

    void addAt(int pos, int r, String n, int a, String g) {
        if (pos == 1) {
            addFirst(r, n, a, g);
            return;
        }
        Node t = head;
        for (int i = 1; i < pos - 1 && t != null; i++)
            t = t.next;
        if (t == null)
            return;
        Node nn = new Node(r, n, a, g);
        nn.next = t.next;
        t.next = nn;
    }

    void deleteByRoll(int r) {
        if (head == null)
            return;
        if (head.roll == r) {
            head = head.next;
            return;
        }
        Node t = head;
        while (t.next != null && t.next.roll != r)
            t = t.next;
        if (t.next != null)
            t.next = t.next.next;
    }

    Node search(int r) {
        Node t = head;
        while (t != null) {
            if (t.roll == r)
                return t;
            t = t.next;
        }
        return null;
    }

    void updateGrade(int r, String g) {
        Node s = search(r);
        if (s != null)
            s.grade = g;
    }

    void display() {
        Node t = head;
        while (t != null) {
            System.out.println(t.roll + " " + t.name + " " + t.age + " " + t.grade);
            t = t.next;
        }
    }

    public static void main(String[] args) {
        studentRecord sl = new studentRecord();

        sl.addFirst(1, "Asha", 20, "A");
        sl.addLast(2, "Ravi", 21, "B");
        sl.addAt(2, 3, "Kiran", 22, "C");

        sl.display();

        sl.updateGrade(2, "A+");
        sl.deleteByRoll(1);

        System.out.println("After Update & Delete:");
        sl.display();
    }
}
