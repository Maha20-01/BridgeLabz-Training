package linkedlist;

public class libraryManagement {

        static class Node {
            String title, author, genre;
            int id;
            boolean avail;
            Node prev, next;

            Node(int i, String t, String a, String g, boolean v) {
                id = i;
                title = t;
                author = a;
                genre = g;
                avail = v;
            }
        }

        Node head, tail;
        int cnt;

        void addFirst(int i, String t, String a, String g, boolean v) {
            Node nn = new Node(i, t, a, g, v);
            if (head == null) {
                head = tail = nn;
                cnt++;
                return;
            }
            nn.next = head;
            head.prev = nn;
            head = nn;
            cnt++;
        }

        void addLast(int i, String t, String a, String g, boolean v) {
            Node nn = new Node(i, t, a, g, v);
            if (tail == null) {
                head = tail = nn;
                cnt++;
                return;
            }
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
            cnt++;
        }

        void addAt(int pos, int i, String t, String a, String g, boolean v) {
            if (pos <= 1) {
                addFirst(i, t, a, g, v);
                return;
            }
            if (pos > cnt) {
                addLast(i, t, a, g, v);
                return;
            }
            Node cur = head;
            for (int k = 1; k < pos - 1; k++)
                cur = cur.next;
            Node nn = new Node(i, t, a, g, v);
            nn.next = cur.next;
            nn.prev = cur;
            cur.next.prev = nn;
            cur.next = nn;
            cnt++;
        }

        void removeById(int i) {
            Node cur = head;
            while (cur != null) {
                if (cur.id == i) {
                    if (cur == head)
                        head = cur.next;
                    if (cur == tail)
                        tail = cur.prev;
                    if (cur.prev != null)
                        cur.prev.next = cur.next;
                    if (cur.next != null)
                        cur.next.prev = cur.prev;
                    cnt--;
                    return;
                }
                cur = cur.next;
            }
        }

        void searchByTitle(String t) {
            Node cur = head;
            while (cur != null) {
                if (cur.title.equalsIgnoreCase(t))
                    print(cur);
                cur = cur.next;
            }
        }

        void searchByAuthor(String a) {
            Node cur = head;
            while (cur != null) {
                if (cur.author.equalsIgnoreCase(a))
                    print(cur);
                cur = cur.next;
            }
        }

        void updateStatus(int i, boolean v) {
            Node cur = head;
            while (cur != null) {
                if (cur.id == i) {
                    cur.avail = v;
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

        int countBooks() {
            return cnt;
        }

        void print(Node n) {
            System.out.println(
                    n.id + " | " + n.title + " | " + n.author + " | " +
                            n.genre + " | " + (n.avail ? "Available" : "Issued")
            );
        }

        public static void main(String[] args) {
            libraryManagement lb = new libraryManagement();

            lb.addFirst(1, "1984", "Orwell", "Dystopian", true);
            lb.addLast(2, "Hamlet", "Shakespeare", "Drama", false);
            lb.addAt(2, 3, "Dune", "Herbert", "SciFi", true);

            System.out.println("Forward:");
            lb.showForward();

            System.out.println("Reverse:");
            lb.showReverse();

            System.out.println("Search Title Dune:");
            lb.searchByTitle("Dune");

            System.out.println("Search Author Orwell:");
            lb.searchByAuthor("Orwell");

            lb.updateStatus(2, true);
            lb.removeById(1);

            System.out.println("After Update & Remove:");
            lb.showForward();

            System.out.println("Total Books: " + lb.countBooks());
        }
    }
