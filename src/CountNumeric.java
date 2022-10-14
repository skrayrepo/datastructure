public class CountNumeric {
    public static void main(String[] args) {
        int num = 455850;
        int count = 0;
        int rem;
        while(num > 0){
            rem = num % 10;
            if(rem == 5){
                count ++;
            }
            num = num/10; //this division to make number to be reduced
        }
        System.out.println("Number of count 5 present"+count);
    }
}
