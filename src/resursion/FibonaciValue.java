package resursion;

public class FibonaciValue {

    //find the fibonacci number at 7
    public static void main(String[] args) {
        int n = 4;
        int result = fibo(n);
        System.out.println("FIbonacci number will be "+result);
    }

    private static int fibo(int n) {
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
