package dsa.datasearch;


    public class stringConcatenation {

        public static void main(String[] args) {

            int[] sizes = {1000, 10000};

            for (int n : sizes) {

                long s1 = System.nanoTime();
                String a = "";
                for (int i = 0; i < n; i++) a = a + "x";
                long e1 = System.nanoTime();

                long s2 = System.nanoTime();
                StringBuilder b = new StringBuilder();
                for (int i = 0; i < n; i++) b.append("x");
                long e2 = System.nanoTime();

                long s3 = System.nanoTime();
                StringBuffer c = new StringBuffer();
                for (int i = 0; i < n; i++) c.append("x");
                long e3 = System.nanoTime();

                System.out.println("N = " + n);
                System.out.println("String        : " + (e1 - s1) / 1_000_000.0 + " ms");
                System.out.println("StringBuilder : " + (e2 - s2) / 1_000_000.0 + " ms");
                System.out.println("StringBuffer  : " + (e3 - s3) / 1_000_000.0 + " ms");
                System.out.println();
            }
        }
    }

