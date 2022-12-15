package sorting.bubblesort;

import java.util.Arrays;

public class DescendingBubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,7,6,5,8,4};
        descBubbleSort(arr);
        System.out.println("Descending arry is"+ Arrays.toString(arr));
    }

    private static void descBubbleSort(int[] arr) {
        boolean alreadySorted = false;
        for(int i = 0;i < arr.length;i++){
            alreadySorted = true;
            for(int j = 1;j < arr.length - i;j++){
                if(arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    alreadySorted = false;
                }
            }
            if(alreadySorted){
                break;
            }
        }
    }
}
