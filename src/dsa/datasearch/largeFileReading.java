package dsa.datasearch;

import java.io.*;

    public class largeFileReading {

        static long fr(String p) throws Exception {
            FileReader r = new FileReader(p);
            long s = System.nanoTime();
            while (r.read() != -1) {}
            long e = System.nanoTime();
            r.close();
            return e - s;
        }

        static long ir(String p) throws Exception {
            InputStreamReader r = new InputStreamReader(new FileInputStream(p));
            long s = System.nanoTime();
            while (r.read() != -1) {}
            long e = System.nanoTime();
            r.close();
            return e - s;
        }

        public static void main(String[] args) throws Exception {

            String p = "C:\\Users\\MAHA\\BridgeLabz_Java_CG\\src\\dsa\\largefile.txt";

            long t1 = fr(p);
            long t2 = ir(p);

            System.out.println("FileReader        : " + t1 / 1_000_000.0 + " ms");
            System.out.println("InputStreamReader : " + t2 / 1_000_000.0 + " ms");
        }
    }

