package resursion;

public class SumOfAllDigits {
    public static void main(String[] args) {
        int num = 1234;
        sumOfDigits(num);
    }

    private static void sumOfDigits(int num) {
        int sum = 0;
        int rem = 0;
        while (num > 0){
            rem = num % 10;
            sum+=rem;
            num/=10;
        }
        System.out.println("Sum of all digit in a number is "+sum);
    }
}
