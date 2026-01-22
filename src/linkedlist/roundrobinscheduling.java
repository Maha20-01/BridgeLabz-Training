package linkedlist;

public class roundrobinscheduling {


        static class Node {
            int pid, bt, rt, pri;
            Node next;

            Node(int p, int b, int r) {
                pid = p;
                bt = b;
                rt = b;
                pri = r;
            }
        }

        Node head, cur;
        int tq, time, n;
        int totWt, totTat;

    roundrobinscheduling(int q) {
            tq = q;
        }

        void addLast(int p, int b, int r) {
            Node nn = new Node(p, b, r);
            if (head == null) {
                head = nn;
                nn.next = head;
                cur = head;
                n++;
                return;
            }
            Node t = head;
            while (t.next != head)
                t = t.next;
            t.next = nn;
            nn.next = head;
            n++;
        }

        void remove(Node prev, Node cur) {
            if (cur == head && cur.next == head) {
                head = this.cur = null;
                return;
            }
            if (cur == head)
                head = head.next;
            prev.next = cur.next;
            if (this.cur == cur)
                this.cur = cur.next;
        }

        void show() {
            if (head == null)
                return;
            Node t = head;
            do {
                System.out.print("P" + t.pid + "(" + t.rt + ") ");
                t = t.next;
            } while (t != head);
            System.out.println();
        }

        void run() {
            if (head == null)
                return;
            Node prev = null;
            while (head != null) {
                if (cur.rt > tq) {
                    cur.rt -= tq;
                    time += tq;
                } else {
                    time += cur.rt;
                    totWt += time - cur.bt;
                    totTat += time;
                    cur.rt = 0;
                    remove(prev, cur);
                    show();
                    cur = prev == null ? head : prev.next;
                    continue;
                }
                show();
                prev = cur;
                cur = cur.next;
            }
        }

        void result() {
            System.out.println("Avg Waiting Time: " + (double) totWt / n);
            System.out.println("Avg Turnaround Time: " + (double) totTat / n);
        }

        public static void main(String[] args) {
            roundrobinscheduling rr = new roundrobinscheduling(3);

            rr.addLast(1, 10, 1);
            rr.addLast(2, 5, 2);
            rr.addLast(3, 8, 1);

            System.out.println("Initial Queue:");
            rr.show();

            rr.run();
            rr.result();
        }
    }

