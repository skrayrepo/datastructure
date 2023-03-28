package sorting;

import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
        int[] arr = {4,6,2,7,5,3,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            int start = 0;
            int end = arr.length - i -1;
            int largestIndex = largestIndex(arr,start,end);
            swaping(arr,largestIndex,end);
        }
    }

    private static void swaping(int[] arr, int largestIndex, int end) {
        int temp = arr[largestIndex];
        arr[largestIndex] = arr[end];
        arr[end] = temp;
    }

    private static int largestIndex(int[] arr, int start, int end) {
        int largestIndex = start;
        for (int i = 0; i <= end; i++) {
            if(arr[largestIndex] < arr[i]){
                largestIndex = i;
            }
        }
        return largestIndex;
    }


}
