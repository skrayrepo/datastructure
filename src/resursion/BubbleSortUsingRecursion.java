package resursion;

import java.util.Arrays;

public class BubbleSortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int i = 0;
        int j = 1;
        bubbleSortRecursion(arr,i,j);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSortRecursion(int[] arr, int i, int j) {

        if(i == arr.length){
            return;
        }
        if(j < arr.length - i){
            if(arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
            bubbleSortRecursion(arr,i,j+1);
        }else{
            bubbleSortRecursion(arr,i+1,1);
        }
    }

    private static void bubbleSortWithoutRecursion(int[] arr) {
        boolean alreadySorted = false;
        for(int i=0; i < arr.length;i++){
            for(int j=1; j < arr.length - i; j++){
                alreadySorted = true;
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    alreadySorted = false;
                }
            }
            //
            if(alreadySorted){
                break;
            }
        }
    }
}
