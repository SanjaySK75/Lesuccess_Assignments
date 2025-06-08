import java.util.*;
public class ReverseFirstKElementsOfQueue {
    public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        if (q == null || k > q.size()) return q;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(q.poll());
        }
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
        int size = q.size();
        for (int i = 0; i < size - k; i++) {
            q.add(q.poll());
        }
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k = 3;
        Queue<Integer> result = reverseFirstK(q, k);
        while (!result.isEmpty()) {
            System.out.print(result.poll() + " ");
        }
    }
}
