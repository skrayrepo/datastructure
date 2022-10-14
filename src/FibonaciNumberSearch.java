public class FibonaciNumberSearch {
    public static void main(String[] args) {
        int nth = 8;
        int[] arr = new int[nth];
        for(int i = 0; i < nth; i++){
            if(i == 0)
                arr[i] = i;
            else if( i == 1)
                arr[i] = i;
            else{
                arr[i] = arr[i-1] + arr[i-2];
            }

        }
        for(int i = 0; i < nth; i++){
            System.out.println("Fibonacci number series::" +arr[i]);
        }
    }
}


