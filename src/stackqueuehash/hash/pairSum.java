package stackqueuehash.hash;

import java.util.HashMap;
import java.util.Map;

class pairSum {

    static boolean hasPair(int[] a, int t) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int x : a) {
            int y = t - x;
            if (mp.containsKey(y))
                return true;
            mp.put(x, 1);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {8, 7, 2, 5, 3, 1};
        int t = 10;

        System.out.println(hasPair(a, t));
    }
}
