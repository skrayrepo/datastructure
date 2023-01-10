package resursion;

public class CountNumberExists {
    public static void main(String[] args) {
        int num = 35755453;
        int result = 5;
        int count = 0;
        count = countNumbers(num,5,count);
        System.out.println(count);
    }

    private static int countNumbers(int num, int result, int count) {
        if(num == 0){
            return count;
        }
        int rem = num % 10;
        if(rem == result){
            return countNumbers(num/10,result,count+1);
        }
        return countNumbers(num/10,result,count);
    }
}
