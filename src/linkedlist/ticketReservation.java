package linkedlist;

class ticketReservation {

    static class Node {
        int id, seat;
        String cust, movie, time;
        Node next;

        Node(int i, String c, String m, int s, String t) {
            id = i;
            cust = c;
            movie = m;
            seat = s;
            time = t;
        }
    }

    Node head;
    int cnt;

    void addLast(int i, String c, String m, int s, String t) {
        Node nn = new Node(i, c, m, s, t);
        if (head == null) {
            head = nn;
            nn.next = head;
            cnt++;
            return;
        }
        Node x = head;
        while (x.next != head)
            x = x.next;
        x.next = nn;
        nn.next = head;
        cnt++;
    }

    void removeById(int i) {
        if (head == null)
            return;
        if (head.id == i && head.next == head) {
            head = null;
            cnt--;
            return;
        }
        if (head.id == i) {
            Node x = head;
            while (x.next != head)
                x = x.next;
            head = head.next;
            x.next = head;
            cnt--;
            return;
        }
        Node x = head;
        while (x.next != head && x.next.id != i)
            x = x.next;
        if (x.next.id == i) {
            x.next = x.next.next;
            cnt--;
        }
    }

    void showAll() {
        if (head == null)
            return;
        Node x = head;
        do {
            print(x);
            x = x.next;
        } while (x != head);
    }

    void searchByCust(String c) {
        if (head == null)
            return;
        Node x = head;
        do {
            if (x.cust.equalsIgnoreCase(c))
                print(x);
            x = x.next;
        } while (x != head);
    }

    void searchByMovie(String m) {
        if (head == null)
            return;
        Node x = head;
        do {
            if (x.movie.equalsIgnoreCase(m))
                print(x);
            x = x.next;
        } while (x != head);
    }

    int total() {
        return cnt;
    }

    void print(Node n) {
        System.out.println(
                n.id + " | " + n.cust + " | " + n.movie + " | " +
                        n.seat + " | " + n.time
        );
    }

    public static void main(String[] args) {
        ticketReservation ts = new ticketReservation();

        ts.addLast(101, "Asha", "Inception", 12, "10:30");
        ts.addLast(102, "Ravi", "Avatar", 15, "11:00");
        ts.addLast(103, "Meena", "Inception", 18, "11:15");

        System.out.println("All Tickets:");
        ts.showAll();

        System.out.println("Search Customer Ravi:");
        ts.searchByCust("Ravi");

        System.out.println("Search Movie Inception:");
        ts.searchByMovie("Inception");

        ts.removeById(102);

        System.out.println("After Removal:");
        ts.showAll();

        System.out.println("Total Tickets: " + ts.total());
    }
}
