package collection.queue;

import collection.stack.customstack.StackException;

public class CustomQueue {
    int[] arr = null;
    int end = 0;
    CustomQueue(int size){
        this.arr = new int[size];
    }
     public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is full");
            return false;
        }
        arr[end] = item;
        end++;
        return true;
     }

     public int remove() throws StackException {
        if(isEmpty()){
            throw new StackException("Queue is empty");
        }
        int removed = arr[0];
         for (int i = 1; i < end; i++) {
             arr[i-1] = arr[i];  //Moved one position left
         }
        end-- ;
         return removed;
     }

    private boolean isEmpty() {
        return this.end == 0;
    }

    private boolean isFull() {
        return this.end == arr.length;
    }

    public void display(){
        for (int i = 0; i < end ; i++) {
            System.out.print(arr[i] +"<-");
        }
        System.out.println("END");
    }
}
