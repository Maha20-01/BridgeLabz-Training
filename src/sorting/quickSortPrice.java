package sorting;

class quickSortPrice {

    static void sort(int[] a, int l, int r) {
        if (l >= r)
            return;
        int p = part(a, l, r);
        sort(a, l, p - 1);
        sort(a, p + 1, r);
    }

    static int part(int[] a, int l, int r) {
        int piv = a[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (a[j] < piv) {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i + 1];
        a[i + 1] = a[r];
        a[r] = t;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] p = {899, 299, 499, 199, 699, 399};

        sort(p, 0, p.length - 1);

        for (int x : p)
            System.out.print(x + " ");
    }
}
