package dsa.datasearch;

import java.util.*;

    public class compareDiffDSA {

        static boolean arr(int[] a, int t) {
            for (int x : a)
                if (x == t) return true;
            return false;
        }

        public static void main(String[] args) {

            int[] sizes = {1000, 100000, 1000000};

            for (int n : sizes) {

                int[] a = new int[n];
                for (int i = 0; i < n; i++) a[i] = i;

                HashSet<Integer> h = new HashSet<>();
                TreeSet<Integer> t = new TreeSet<>();

                for (int i = 0; i < n; i++) {
                    h.add(i);
                    t.add(i);
                }

                int key = n - 1;

                long s1 = System.nanoTime();
                arr(a, key);
                long e1 = System.nanoTime();

                long s2 = System.nanoTime();
                h.contains(key);
                long e2 = System.nanoTime();

                long s3 = System.nanoTime();
                t.contains(key);
                long e3 = System.nanoTime();

                System.out.println("N = " + n);
                System.out.println("Array   : " + (e1 - s1) / 1_000_000.0 + " ms");
                System.out.println("HashSet : " + (e2 - s2) / 1_000_000.0 + " ms");
                System.out.println("TreeSet : " + (e3 - s3) / 1_000_000.0 + " ms");
                System.out.println();
            }
        }
    }
