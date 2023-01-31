package collection.queue;

import collection.stack.customstack.StackException;

public class QueueMainClass {
    public static void main(String[] args) throws StackException {
        CustomQueue customQueue = new CustomQueue(3);
        customQueue.insert(5);
        customQueue.insert(6);
        customQueue.insert(7);
        customQueue.insert(8);
        customQueue.display();
        customQueue.remove();
        customQueue.display();
    }
}
