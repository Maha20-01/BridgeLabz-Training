package stackqueuehash.hash;

import java.util.HashMap;
import java.util.Map;

class twoSum {

    static int[] find(int[] a, int t) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            int need = t - a[i];
            if (mp.containsKey(need))
                return new int[]{mp.get(need), i};
            mp.put(a[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        int t = 9;

        int[] res = find(a, t);
        System.out.println(res[0] + " " + res[1]);
    }
}
