package sorting;

class heapSortSalary {

    static void sort(int[] a) {
        int n = a.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heap(a, n, i);

        for (int i = n - 1; i > 0; i--) {
            int t = a[0];
            a[0] = a[i];
            a[i] = t;
            heap(a, i, 0);
        }
    }

    static void heap(int[] a, int n, int i) {
        int mx = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && a[l] > a[mx])
            mx = l;
        if (r < n && a[r] > a[mx])
            mx = r;

        if (mx != i) {
            int t = a[i];
            a[i] = a[mx];
            a[mx] = t;
            heap(a, n, mx);
        }
    }

    public static void main(String[] args) {
        int[] sal = {45000, 70000, 50000, 60000, 55000};

        sort(sal);

        for (int x : sal)
            System.out.print(x + " ");
    }
}
