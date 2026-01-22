package stackqueuehash.stackQueue;

import java.util.Stack;

class sortStack {

    void sort(Stack<Integer> st) {
        if (st.isEmpty())
            return;
        int x = st.pop();
        sort(st);
        insert(st, x);
    }

    void insert(Stack<Integer> st, int x) {
        if (st.isEmpty() || st.peek() <= x) {
            st.push(x);
            return;
        }
        int y = st.pop();
        insert(st, x);
        st.push(y);
    }

    public static void main(String[] args) {
        sortStack ss = new sortStack();
        Stack<Integer> st = new Stack<>();

        st.push(30);
        st.push(10);
        st.push(50);
        st.push(20);

        ss.sort(st);

        while (!st.isEmpty())
            System.out.print(st.pop() + " ");
    }
}
