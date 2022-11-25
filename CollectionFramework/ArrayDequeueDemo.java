package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueDemo {
    public static void main(String[] args) {

        Deque<Integer> deque=new ArrayDeque<>();

        deque.add(10);
        deque.addFirst(20);
        deque.addLast(30);
        deque.offer(40);
        System.out.println(deque);

        System.out.println(deque.pop());
        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque);

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.remove());
        System.out.println(deque);
        System.out.println(deque.pop());

        System.out.println(deque);



    }
}
