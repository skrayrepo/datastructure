package resursion;

public class SimpleRecursion {
    public static void main(String[] args) {
        int num =5;
        fun1(num);
    }

    private static void fun1(int num) {
        if (num == 0) {
            return;
        }
        System.out.println("Recursion number:"+num);
        fun1(num-1);
        System.out.println("Recursion number:"+num);
    }
}
