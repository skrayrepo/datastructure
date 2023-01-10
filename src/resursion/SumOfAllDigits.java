package resursion;

public class SumOfAllDigits {
    public static void main(String[] args) {
        int num = 1234;
        int result = 0;
        sumOfDigits(num);
        //Call recursive function to solve this
        result = recursiveSumOfDigits(num,result);
        System.out.println("Recursive Sum of all digit in a number is "+result);
    }

    private static int recursiveSumOfDigits(int num, int result) {
        if(num == 0){
            return result;
        }
        int rem = num % 10;
        return recursiveSumOfDigits(num/=10,result+=rem);
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
