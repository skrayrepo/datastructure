package bubblesort;

import java.util.Arrays;

public class AscendingBubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,7,6,5,8,4};
        ascBubbleSort(arr);
        System.out.println("Sorted array "+ Arrays.toString(arr));
    }

    private static void ascBubbleSort(int[] arr) {
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
