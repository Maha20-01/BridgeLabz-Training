package linkedlist;

public class undoRedo
 {

    static class Node {
        String txt;
        Node prev, next;

        Node(String t) {
            txt = t;
        }
    }

    Node head, tail, cur;
    int size, limit = 10;

    void add(String t) {
        Node nn = new Node(t);
        if (cur != null && cur.next != null) {
            cur.next.prev = null;
            cur.next = null;
            tail = cur;
            size = count();
        }
        if (head == null) {
            head = tail = cur = nn;
            size = 1;
            return;
        }
        tail.next = nn;
        nn.prev = tail;
        tail = nn;
        cur = nn;
        size++;
        if (size > limit)
            removeFirst();
    }

    void removeFirst() {
        head = head.next;
        head.prev = null;
        size--;
    }

    void undo() {
        if (cur != null && cur.prev != null)
            cur = cur.prev;
    }

    void redo() {
        if (cur != null && cur.next != null)
            cur = cur.next;
    }

    void show() {
        if (cur != null)
            System.out.println("Current: " + cur.txt);
    }

    int count() {
        int c = 0;
        Node t = head;
        while (t != null) {
            c++;
            t = t.next;
        }
        return c;
    }

    public static void main(String[] args) {
        undoRedo ed = new undoRedo();

        ed.add("H");
        ed.add("He");
        ed.add("Hel");
        ed.add("Hell");
        ed.add("Hello");

        ed.show();

        ed.undo();
        ed.undo();
        ed.show();

        ed.redo();
        ed.show();

        ed.add("Hello World");
        ed.show();
    }
}
