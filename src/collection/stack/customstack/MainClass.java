package collection.stack.customstack;

public class MainClass {

    public static void main(String[] args) throws StackException {
        //fixed size stack
        CustomStack<Integer> customStack = new CustomStack<>();
        //Dynamic size Stack
        DynamicStack<Integer> dynamicStack = new DynamicStack<>();
        dynamicStack.push(30);
        dynamicStack.push(40);
        dynamicStack.push(50);
        dynamicStack.push(70);
        dynamicStack.push(90);
        dynamicStack.push(100);
        System.out.println(dynamicStack.pop());
        //stack.pop();
        System.out.println(dynamicStack);
        Integer peek = dynamicStack.peek();
        System.out.println(peek);

    }
}
