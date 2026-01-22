package stackqueuehash.hash;
import java.util.HashSet;
import java.util.Set;

class longConSeq {

    static int len(int[] a) {
        Set<Integer> st = new HashSet<>();
        for (int x : a)
            st.add(x);

        int best = 0;

        for (int x : st) {
            if (!st.contains(x - 1)) {
                int cur = x;
                int cnt = 1;
                while (st.contains(cur + 1)) {
                    cur++;
                    cnt++;
                }
                best = Math.max(best, cnt);
            }
        }
        return best;
    }

    public static void main(String[] args) {
        int[] a = {100, 4, 200, 1, 3, 2};
        System.out.println(len(a));
    }
}
