package resursion;

public class ReverseNumber {

    public static void main(String[] args) {
        int num = 35467;
        int result = 0;
        result = recursiveReverseNumber(num,result);
        System.out.println("Recursive Reverse number is"+result);
        result = 0;
        result = nonRecursiveReverseNumber(num,result);
        System.out.println("Reverse number is"+result);
    }

    private static int nonRecursiveReverseNumber(int num, int result) {
        while(num > 0){
            int rem = num % 10;
            result = rem+(result * 10);
            num/=10;
        }
        return result;
    }

    private static int recursiveReverseNumber(int num, int result) {
        if(num == 0){
            return result;
        }
        int rem = num%10;
        return recursiveReverseNumber(num/10,result = rem +(result*10));
    }


}
