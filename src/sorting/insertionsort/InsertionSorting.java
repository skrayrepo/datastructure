package sorting.insertionsort;

import java.util.Arrays;

public class InsertionSorting {

    public static void main(String[] args) {
        int[] arr = {5,3,4,2,1,0};
        insertionSorting(arr);
        System.out.println("Insertion sorted array" + Arrays.toString(arr));
    }

    private static void insertionSorting(int[] arr) {
        for(int i=0; i< arr.length -1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
