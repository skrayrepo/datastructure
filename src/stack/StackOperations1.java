package stack;

import java.util.Stack;

public class StackOperations1 {
    public static void main(String[] args) {
        String[] arr = new String[] { "2", "1", "+", "3", "*" };
        String operators = "+-/*";
        //String[] arr = new String[] { "4", "13", "5", "/", "+"};
        stackOperations(arr,operators);
    }

    private static void stackOperations(String[] arr,String operators) {
        int count = 0;
        Stack<String> stack = new Stack<>();
        for(String field:arr){
            if(!operators.contains(field)){
                stack.push(field);
            }else{
                Integer a = Integer.valueOf(stack.pop());
                Integer b = Integer.valueOf(stack.pop());
                switch (field){
                    case "+":
                            stack.push(String.valueOf(a+b));
                            break;
                    case "-":
                            stack.push(String.valueOf(b-a));
                            break;
                    case "*":
                            stack.push(String.valueOf(a*b));
                            break;
                    case "/":
                        stack.push(String.valueOf(a/b));
                }
            }
        }
        Integer result = Integer.valueOf(stack.pop());
        System.out.println(result);
    }
}
