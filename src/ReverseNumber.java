public class ReverseNumber {
    public static void main(String[] args) {
        //logic should be result*10+reminder
        int num = 12345;
        int result = 0;
        int rem;
        while( num > 0){
            rem = num % 10;
            result = result *10 +rem;
            num/=10;
        }
        System.out.println("Reverse of numers" +result);
    }
}
