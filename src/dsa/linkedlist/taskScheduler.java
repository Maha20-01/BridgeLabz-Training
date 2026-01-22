package linkedlist;

class taskScheduler {

    static class Node {
        int id, pri;
        String name, date;
        Node next;

        Node(int i, String n, int p, String d) {
            id = i;
            name = n;
            pri = p;
            date = d;
        }
    }

    Node head, cur;

    void addFirst(int i, String n, int p, String d) {
        Node nn = new Node(i, n, p, d);
        if (head == null) {
            head = nn;
            nn.next = head;
            cur = head;
            return;
        }
        Node t = head;
        while (t.next != head)
            t = t.next;
        nn.next = head;
        t.next = nn;
        head = nn;
    }

    void addLast(int i, String n, int p, String d) {
        if (head == null) {
            addFirst(i, n, p, d);
            return;
        }
        Node nn = new Node(i, n, p, d);
        Node t = head;
        while (t.next != head)
            t = t.next;
        t.next = nn;
        nn.next = head;
    }

    void addAt(int pos, int i, String n, int p, String d) {
        if (pos == 1) {
            addFirst(i, n, p, d);
            return;
        }
        Node t = head;
        for (int c = 1; c < pos - 1 && t.next != head; c++)
            t = t.next;
        Node nn = new Node(i, n, p, d);
        nn.next = t.next;
        t.next = nn;
    }

    void removeById(int i) {
        if (head == null)
            return;
        if (head.id == i && head.next == head) {
            head = cur = null;
            return;
        }
        if (head.id == i) {
            Node t = head;
            while (t.next != head)
                t = t.next;
            head = head.next;
            t.next = head;
            cur = head;
            return;
        }
        Node t = head;
        while (t.next != head && t.next.id != i)
            t = t.next;
        if (t.next.id == i)
            t.next = t.next.next;
    }

    void nextTask() {
        if (cur != null) {
            print(cur);
            cur = cur.next;
        }
    }

    void showAll() {
        if (head == null)
            return;
        Node t = head;
        do {
            print(t);
            t = t.next;
        } while (t != head);
    }

    void searchByPri(int p) {
        if (head == null)
            return;
        Node t = head;
        do {
            if (t.pri == p)
                print(t);
            t = t.next;
        } while (t != head);
    }

    void print(Node n) {
        System.out.println(n.id + " | " + n.name + " | " + n.pri + " | " + n.date);
    }

    public static void main(String[] args) {
        taskScheduler tl = new taskScheduler();

        tl.addFirst(1, "Design", 1, "10-02-2026");
        tl.addLast(2, "Coding", 2, "12-02-2026");
        tl.addAt(2, 3, "Testing", 1, "11-02-2026");

        System.out.println("All Tasks:");
        tl.showAll();

        System.out.println("Current & Next:");
        tl.nextTask();
        tl.nextTask();

        System.out.println("Priority 1:");
        tl.searchByPri(1);

        tl.removeById(2);

        System.out.println("After Remove:");
        tl.showAll();
    }
}
