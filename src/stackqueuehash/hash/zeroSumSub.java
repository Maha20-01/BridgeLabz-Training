package stackqueuehash.hash;
import java.util.*;

class zeroSumSub {

    static void find(int[] a) {
        Map<Integer, List<Integer>> mp = new HashMap<>();
        int sum = 0;

        mp.put(0, new ArrayList<>());
        mp.get(0).add(-1);

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (mp.containsKey(sum)) {
                for (int s : mp.get(sum))
                    System.out.println((s + 1) + " " + i);
            }
            mp.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
    }

    public static void main(String[] args) {
        int[] a = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        find(a);
    }
}
