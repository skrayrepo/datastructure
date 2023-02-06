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
        deque.addFirst(20);
        deque.add(50);
        deque.add(30);
        deque.add(50);
        System.out.println(deque);
        System.out.println(deque.getLast());
        //deque.push(90);
        //deque.push(40);
        //System.out.println(deque.peek());
       // System.out.println(deque.peek());
        //deque.pop();
        System.out.println(deque.peekFirst());
        System.out.println(deque);

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        //Student su = new Student();
        priorityQueue.add(new Student(3,"San"));
        priorityQueue.add(new Student(2,"Van"));
        priorityQueue.add(new Student(5,"Zap"));
        priorityQueue.add(new Student(1,"Ara"));
        System.out.println(priorityQueue);
    }
}
