package stackqueuehash.stackQueue;
import java.util.Stack;

public class queueUsingStack {


        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        void enqueue(int x) {
            s1.push(x);
        }

        int dequeue() {
            if (s2.isEmpty()) {
                while (!s1.isEmpty())
                    s2.push(s1.pop());
            }
            if (s2.isEmpty())
                return -1;
            return s2.pop();
        }

        void display() {
            if (!s2.isEmpty()) {
                for (int i = s2.size() - 1; i >= 0; i--)
                    System.out.print(s2.get(i) + " ");
            }
            for (int x : s1)
                System.out.print(x + " ");
            System.out.println();
        }

        public static void main(String[] args) {
            queueUsingStack q = new queueUsingStack();

            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);

            q.display();

            System.out.println(q.dequeue());
            System.out.println(q.dequeue());

            q.enqueue(40);

            q.display();
        }
    }

