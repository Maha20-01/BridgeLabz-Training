package dsa.datasearch;

    public class recursivevsIterativeFibo {

        static long rec(int n) {
            if (n <= 1) return n;
            return rec(n - 1) + rec(n - 2);
        }

        static long ite(int n) {
            if (n <= 1) return n;
            long a = 0, b = 1, s = 0;
            for (int i = 2; i <= n; i++) {
                s = a + b;
                a = b;
                b = s;
            }
            return b;
        }

        public static void main(String[] args) {

            int[] vals = {10, 30};

            for (int n : vals) {

                long s1 = System.nanoTime();
                rec(n);
                long e1 = System.nanoTime();

                long s2 = System.nanoTime();
                ite(n);
                long e2 = System.nanoTime();

                System.out.println("N = " + n);
                System.out.println("Recursive : " + (e1 - s1) / 1_000_000.0 + " ms");
                System.out.println("Iterative : " + (e2 - s2) / 1_000_000.0 + " ms");
                System.out.println();
            }
        }
    }

