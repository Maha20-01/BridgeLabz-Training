package stackqueuehash.stackQueue;

import java.util.Stack;

class stockSpan {

    static int[] span(int[] a) {
        int n = a.length;
        int[] sp = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && a[st.peek()] <= a[i])
                st.pop();
            sp[i] = st.isEmpty() ? i + 1 : i - st.peek();
            st.push(i);
        }
        return sp;
    }

    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int[] res = span(price);

        for (int x : res)
            System.out.print(x + " ");
    }
}
