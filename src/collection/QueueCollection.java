package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollection {

    public static void main(String[] args) {

        Queue queue = new PriorityQueue();

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(40);
        deque.add(20);
        deque.add(50);
        deque.add(30);
        deque.add(50);
        System.out.println(deque.getLast());
        deque.push(90);
        deque.push(40);
        System.out.println(deque.peek());
        System.out.println(deque.peek());
        //deque.pop();
        //deque.pop();
        System.out.println(deque);
    }
}
