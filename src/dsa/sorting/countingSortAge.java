package sorting;
class countingSortAge {

    static void sort(int[] a) {
        int min = 10, max = 18;
        int[] cnt = new int[max - min + 1];

        for (int x : a)
            cnt[x - min]++;

        int k = 0;
        for (int i = 0; i < cnt.length; i++) {
            while (cnt[i]-- > 0)
                a[k++] = i + min;
        }
    }

    public static void main(String[] args) {
        int[] age = {12, 15, 11, 14, 10, 18, 13, 15};

        sort(age);

        for (int x : age)
            System.out.print(x + " ");
    }
}
