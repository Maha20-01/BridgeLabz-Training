package sorting;

class insertionSortIds {

    static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int k = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > k) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = k;
        }
    }

    public static void main(String[] args) {
        int[] id = {104, 101, 109, 102, 105};

        sort(id);

        for (int x : id)
            System.out.print(x + " ");
    }
}
