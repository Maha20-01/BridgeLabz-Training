package stackqueuehash.stackQueue;

import java.util.ArrayDeque;
import java.util.Deque;

class slideMax {

    static int[] maxWin(int[] a, int k) {
        int n = a.length;
        int[] res = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        int idx = 0;

        for (int i = 0; i < n; i++) {
            if (!dq.isEmpty() && dq.peekFirst() <= i - k)
                dq.pollFirst();
            while (!dq.isEmpty() && a[dq.peekLast()] <= a[i])
                dq.pollLast();
            dq.addLast(i);
            if (i >= k - 1)
                res[idx++] = a[dq.peekFirst()];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] r = maxWin(a, k);

        for (int x : r)
            System.out.print(x + " ");
    }
}
