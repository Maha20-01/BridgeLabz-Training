package dsa.datasearch;

import java.util.*;

    public class sortingDataEfficiency {

        static void bub(int[] a) {
            int n = a.length;
            for (int i = 0; i < n - 1; i++)
                for (int j = 0; j < n - i - 1; j++)
                    if (a[j] > a[j + 1]) {
                        int t = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = t;
                    }
        }

        static void mer(int[] a, int l, int r) {
            if (l >= r) return;
            int m = (l + r) / 2;
            mer(a, l, m);
            mer(a, m + 1, r);
            mg(a, l, m, r);
        }

        static void mg(int[] a, int l, int m, int r) {
            int[] x = Arrays.copyOfRange(a, l, m + 1);
            int[] y = Arrays.copyOfRange(a, m + 1, r + 1);
            int i = 0, j = 0, k = l;
            while (i < x.length && j < y.length)
                a[k++] = x[i] <= y[j] ? x[i++] : y[j++];
            while (i < x.length) a[k++] = x[i++];
            while (j < y.length) a[k++] = y[j++];
        }

        static void qui(int[] a, int l, int r) {
            if (l >= r) return;
            int p = pt(a, l, r);
            qui(a, l, p - 1);
            qui(a, p + 1, r);
        }

        static int pt(int[] a, int l, int r) {
            int p = a[r], i = l;
            for (int j = l; j < r; j++)
                if (a[j] < p) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                    i++;
                }
            int t = a[i];
            a[i] = a[r];
            a[r] = t;
            return i;
        }

        public static void main(String[] args) {
            int[] sizes = {1000, 10000};

            for (int n : sizes) {
                int[] a = new Random().ints(n, 1, n).toArray();
                int[] b = a.clone();
                int[] c = a.clone();

                long s1 = System.nanoTime();
                bub(a);
                long e1 = System.nanoTime();

                long s2 = System.nanoTime();
                mer(b, 0, b.length - 1);
                long e2 = System.nanoTime();

                long s3 = System.nanoTime();
                qui(c, 0, c.length - 1);
                long e3 = System.nanoTime();

                System.out.println("N = " + n);
                System.out.println("Bubble : " + (e1 - s1) / 1_000_000.0 + " ms");
                System.out.println("Merge  : " + (e2 - s2) / 1_000_000.0 + " ms");
                System.out.println("Quick  : " + (e3 - s3) / 1_000_000.0 + " ms");
                System.out.println();
            }
        }
    }
