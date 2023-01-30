package collection.stack;

import java.util.Stack;

public class SortingStack {
    public static void main(String[] args) {
        Stack<Integer> input = new Stack<>();
        input.push(3);
        input.push(1);
        input.push(2);
        System.out.println(input);
        Stack<Integer> tempStack = new Stack<>();
        stackSorting(input,tempStack);
        System.out.println(tempStack);
    }

    private static void stackSorting(Stack input, Stack tempStack) {
        while(!input.isEmpty()){
            Integer temp = (Integer) input.pop();
            while(!tempStack.isEmpty() && (Integer)tempStack.peek() > temp){
                input.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
    }
}
