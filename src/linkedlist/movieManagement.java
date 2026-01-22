package linkedlist;

public class movieManagement {

        static class Node {
            String title, dir;
            int year;
            double rate;
            Node prev, next;

            Node(String t, String d, int y, double r) {
                title = t;
                dir = d;
                year = y;
                rate = r;
            }
        }

        Node head, tail;

        void addFirst(String t, String d, int y, double r) {
            Node nn = new Node(t, d, y, r);
            if (head == null) {
                head = tail = nn;
                return;
            }
            nn.next = head;
            head.prev = nn;
            head = nn;
        }

        void addLast(String t, String d, int y, double r) {
            Node nn = new Node(t, d, y, r);
            if (tail == null) {
                head = tail = nn;
                return;
            }
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
        }

        void addAt(int pos, String t, String d, int y, double r) {
            if (pos == 1) {
                addFirst(t, d, y, r);
                return;
            }
            Node cur = head;
            for (int i = 1; i < pos - 1 && cur != null; i++)
                cur = cur.next;
            if (cur == null || cur.next == null) {
                addLast(t, d, y, r);
                return;
            }
            Node nn = new Node(t, d, y, r);
            nn.next = cur.next;
            nn.prev = cur;
            cur.next.prev = nn;
            cur.next = nn;
        }

        void removeByTitle(String t) {
            Node cur = head;
            while (cur != null) {
                if (cur.title.equalsIgnoreCase(t)) {
                    if (cur == head)
                        head = cur.next;
                    if (cur == tail)
                        tail = cur.prev;
                    if (cur.prev != null)
                        cur.prev.next = cur.next;
                    if (cur.next != null)
                        cur.next.prev = cur.prev;
                    return;
                }
                cur = cur.next;
            }
        }

        void searchByDirector(String d) {
            Node cur = head;
            while (cur != null) {
                if (cur.dir.equalsIgnoreCase(d))
                    print(cur);
                cur = cur.next;
            }
        }

        void searchByRating(double r) {
            Node cur = head;
            while (cur != null) {
                if (cur.rate == r)
                    print(cur);
                cur = cur.next;
            }
        }

        void updateRating(String t, double r) {
            Node cur = head;
            while (cur != null) {
                if (cur.title.equalsIgnoreCase(t)) {
                    cur.rate = r;
                    return;
                }
                cur = cur.next;
            }
        }

        void showForward() {
            Node cur = head;
            while (cur != null) {
                print(cur);
                cur = cur.next;
            }
        }

        void showReverse() {
            Node cur = tail;
            while (cur != null) {
                print(cur);
                cur = cur.prev;
            }
        }

        void print(Node n) {
            System.out.println(n.title + " | " + n.dir + " | " + n.year + " | " + n.rate);
        }

        public static void main(String[] args) {
            movieManagement ml = new movieManagement();

            ml.addFirst("Inception", "Nolan", 2010, 8.8);
            ml.addLast("Interstellar", "Nolan", 2014, 8.6);
            ml.addAt(2, "Avatar", "Cameron", 2009, 7.9);

            ml.showForward();

            ml.updateRating("Avatar", 8.1);
            ml.removeByTitle("Inception");

            System.out.println("Forward:");
            ml.showForward();

            System.out.println("Reverse:");
            ml.showReverse();

            System.out.println("Search Director Nolan:");
            ml.searchByDirector("Nolan");

            System.out.println("Search Rating 8.6:");
            ml.searchByRating(8.6);
        }
    }


