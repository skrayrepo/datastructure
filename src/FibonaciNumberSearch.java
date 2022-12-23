import java.util.Arrays;

public class FibonaciNumberSearch {
    public static void main(String[] args) {
        int nth = 9;
        int[] arr = new int[nth];
        int i = 0;
        while(i< nth){
            if(i==0)
                arr[i] = i;
            else if(i ==1)
                arr[i] = i;
            else
                arr[i] = arr[i-1]+arr[i-2];
            i++;
        }
        System.out.println("Fibonaci number will be"+ Arrays.toString(arr));

    }
}


