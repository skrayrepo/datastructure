package collection.stack.customstack;

public class DynamicStack<T> extends CustomStack<T> {

    DynamicStack(int size) {
        super(size);
    }

    DynamicStack(){
        super();
    }

    @Override
    public boolean push(T item) throws StackException {
        if(isFull()){
            T[] temp = (T[]) new Object[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        return super.push(item);
    }
}
