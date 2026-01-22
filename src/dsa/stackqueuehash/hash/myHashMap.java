package stackqueuehash.hash;

class myHashMap {

    static class Node {
        int key, val;
        Node next;

        Node(int k, int v) {
            key = k;
            val = v;
        }
    }

    Node[] tab;
    int size = 10;

    myHashMap() {
        tab = new Node[size];
    }

    int hash(int k) {
        return k % size;
    }

    void put(int k, int v) {
        int i = hash(k);
        Node t = tab[i];
        while (t != null) {
            if (t.key == k) {
                t.val = v;
                return;
            }
            t = t.next;
        }
        Node nn = new Node(k, v);
        nn.next = tab[i];
        tab[i] = nn;
    }

    Integer get(int k) {
        int i = hash(k);
        Node t = tab[i];
        while (t != null) {
            if (t.key == k)
                return t.val;
            t = t.next;
        }
        return null;
    }

    void remove(int k) {
        int i = hash(k);
        Node t = tab[i], p = null;
        while (t != null) {
            if (t.key == k) {
                if (p == null)
                    tab[i] = t.next;
                else
                    p.next = t.next;
                return;
            }
            p = t;
            t = t.next;
        }
    }

    void show() {
        for (int i = 0; i < size; i++) {
            Node t = tab[i];
            while (t != null) {
                System.out.println(t.key + " -> " + t.val);
                t = t.next;
            }
        }
    }

    public static void main(String[] args) {
        myHashMap mp = new myHashMap();

        mp.put(1, 10);
        mp.put(11, 20);
        mp.put(2, 30);

        System.out.println(mp.get(11));

        mp.remove(1);

        mp.show();
    }
}

