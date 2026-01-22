package sorting;

class selectionSortScore {

    static void sort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min])
                    min = j;
            }
            int t = a[min];
            a[min] = a[i];
            a[i] = t;
        }
    }

    public static void main(String[] args) {
        int[] s = {72, 85, 64, 90, 78};

        sort(s);

        for (int x : s)
            System.out.print(x + " ");
    }
}
