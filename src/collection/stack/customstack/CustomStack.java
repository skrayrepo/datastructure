package collection.stack.customstack;

import java.util.Arrays;

public class CustomStack<K> {

    K[] arr;
    int ptr = -1;
    private static final Integer DEFAULT_SiZE = 5;

    @Override
    public String toString() {
        return "CustomStack{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public CustomStack() {
        this.arr = (K[]) new Object[DEFAULT_SiZE];
    }

    CustomStack(int size){
        this.arr = (K[]) new Object[size];
    }

    public boolean push(K item) throws StackException{
        if(isFull()){
            throw new StackException("Stack is already full");
            //return false;
        }
        ptr++;
        arr[ptr] = item;
        return true;
    }

    public K pop() throws StackException {
        K  obj;
        obj = peek();
        remove(arr,obj);
        return obj;
    }

    private void remove(K[] arr, K obj) {
        K[] temp = (K[]) new Object[arr.length -1];;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == obj){
                continue;
            }
            temp[j] = arr[i];
            j++;
        }
        this.arr = temp;
        ptr--;
        //System.out.println(Arrays.toString(this.arr));
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public K peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Stack is empty");
        }
        return arr[ptr];
    }

    public boolean isFull() {
        return ptr == arr.length - 1;
    }
}
