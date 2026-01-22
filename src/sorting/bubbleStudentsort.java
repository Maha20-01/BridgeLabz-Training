package sorting;

class bubbleStudentsort {

    static void sort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean sw = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    sw = true;
                }
            }
            if (!sw)
                break;
        }
    }

    public static void main(String[] args) {
        int[] m = {78, 45, 89, 62, 55, 90};

        sort(m);

        for (int x : m)
            System.out.print(x + " ");
    }
}
