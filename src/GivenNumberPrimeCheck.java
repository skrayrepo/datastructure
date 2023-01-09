import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GivenNumberPrimeCheck {

    public static void main(String[] args) {
        int num = 138;
        boolean isPrime = isPrime(num);
        Integer num1 = 40;
        List<Integer> list = new ArrayList<>();
        System.out.println("Given number is Prime:"+isPrime);
        for (int i = 2; i < num1; i++) {
            if(isPrime(i)){
                list.add(i);
            }
        }
        System.out.println("All prime numbers for given number is:"+ Arrays.toString(list.toArray()));
    }
//2,3,5,7,11,13,17.....prime numbers which divided by itself, not any other numbers
    private static boolean isPrime(int num) {
        if(num <=1){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }


}
