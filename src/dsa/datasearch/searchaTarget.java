package dsa.datasearch;

import java.util.*;

    public class searchaTarget {
        static int lin(int[] a, int t) {
            for (int i = 0; i < a.length; i++)
                if (a[i] == t) return i;
            return -1;
        }

        static int bin(int[] a, int t) {
            int l = 0, r = a.length - 1;
            while (l <= r) {
                int m = (l + r) / 2;
                if (a[m] == t) return m;
                if (a[m] < t) l = m + 1;
                else r = m - 1;
            }
            return -1;
        }

        public static void main(String[] args) {
            int[] sizes = {1000, 10000, 1000000};

            for (int n : sizes) {
                int[] a = new int[n];
                for (int i = 0; i < n; i++) a[i] = i + 1;

                int t = n;

                long s1 = System.nanoTime();
                lin(a, t);
                long e1 = System.nanoTime();

                Arrays.sort(a);

                long s2 = System.nanoTime();
                bin(a, t);
                long e2 = System.nanoTime();

                System.out.println("N = " + n);
                System.out.println("Linear : " + (e1 - s1) / 1_000_000.0 + " ms");
                System.out.println("Binary : " + (e2 - s2) / 1_000_000.0 + " ms");
                System.out.println();
            }
        }
    }
