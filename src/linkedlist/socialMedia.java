package linkedlist;

public class socialMedia {

        static class FNode {
            int fid;
            FNode next;

            FNode(int f) {
                fid = f;
            }
        }

        static class UNode {
            int id, age;
            String name;
            FNode fhead;
            UNode next;

            UNode(int i, String n, int a) {
                id = i;
                name = n;
                age = a;
            }
        }

        UNode head;

        void addUser(int i, String n, int a) {
            UNode nn = new UNode(i, n, a);
            nn.next = head;
            head = nn;
        }

        UNode findUser(int i) {
            UNode t = head;
            while (t != null) {
                if (t.id == i)
                    return t;
                t = t.next;
            }
            return null;
        }

        void addFriend(int u1, int u2) {
            UNode a = findUser(u1);
            UNode b = findUser(u2);
            if (a == null || b == null)
                return;
            a.fhead = new FNode(u2);
            a.fhead.next = a.fhead.next;
            b.fhead = new FNode(u1);
            b.fhead.next = b.fhead.next;
        }

        void addF(UNode u, int f) {
            FNode nn = new FNode(f);
            nn.next = u.fhead;
            u.fhead = nn;
        }

        void connect(int u1, int u2) {
            UNode a = findUser(u1);
            UNode b = findUser(u2);
            if (a == null || b == null)
                return;
            addF(a, u2);
            addF(b, u1);
        }

        void removeFriend(int u1, int u2) {
            UNode a = findUser(u1);
            UNode b = findUser(u2);
            if (a != null)
                remF(a, u2);
            if (b != null)
                remF(b, u1);
        }

        void remF(UNode u, int f) {
            FNode t = u.fhead, p = null;
            while (t != null) {
                if (t.fid == f) {
                    if (p == null)
                        u.fhead = t.next;
                    else
                        p.next = t.next;
                    return;
                }
                p = t;
                t = t.next;
            }
        }

        void showFriends(int i) {
            UNode u = findUser(i);
            if (u == null)
                return;
            System.out.print(u.name + ": ");
            FNode t = u.fhead;
            while (t != null) {
                System.out.print(t.fid + " ");
                t = t.next;
            }
            System.out.println();
        }

        void mutual(int u1, int u2) {
            UNode a = findUser(u1);
            UNode b = findUser(u2);
            if (a == null || b == null)
                return;
            FNode x = a.fhead;
            System.out.print("Mutual: ");
            while (x != null) {
                FNode y = b.fhead;
                while (y != null) {
                    if (x.fid == y.fid)
                        System.out.print(x.fid + " ");
                    y = y.next;
                }
                x = x.next;
            }
            System.out.println();
        }

        void searchByName(String n) {
            UNode t = head;
            while (t != null) {
                if (t.name.equalsIgnoreCase(n))
                    System.out.println(t.id + " " + t.name + " " + t.age);
                t = t.next;
            }
        }

        void searchById(int i) {
            UNode u = findUser(i);
            if (u != null)
                System.out.println(u.id + " " + u.name + " " + u.age);
        }

        void countFriends() {
            UNode t = head;
            while (t != null) {
                int c = 0;
                FNode f = t.fhead;
                while (f != null) {
                    c++;
                    f = f.next;
                }
                System.out.println(t.name + " -> " + c);
                t = t.next;
            }
        }

        public static void main(String[] args) {
            socialMedia sn = new socialMedia();

            sn.addUser(1, "Asha", 21);
            sn.addUser(2, "Ravi", 22);
            sn.addUser(3, "Kiran", 23);
            sn.addUser(4, "Meena", 20);

            sn.connect(1, 2);
            sn.connect(1, 3);
            sn.connect(2, 3);
            sn.connect(2, 4);

            sn.showFriends(1);
            sn.showFriends(2);

            sn.mutual(1, 2);

            sn.removeFriend(1, 3);
            sn.showFriends(1);

            sn.searchByName("Ravi");
            sn.searchById(4);

            sn.countFriends();
        }
    }


