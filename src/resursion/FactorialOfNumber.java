package resursion;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int num = 4;
        int result = fact(num);
        System.out.println("Factorial of a number is "+result);
    }

    private static int fact(int num) {
        if(num ==1){
            return 1;
        }
        return num * fact(num -1);
    }
}
