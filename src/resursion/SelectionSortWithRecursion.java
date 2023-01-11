package resursion;

import java.util.Arrays;

public class SelectionSortWithRecursion {
    public static void main(String[] args) {
        int[] arr = {4,3,2,8,1};
        int i = 0;
        selectionSortRecursion(arr,i);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSortRecursion(int[] arr,int i) {

        if(i == arr.length){
            return;
        }
        int start = 0;
        int end = arr.length - i - 1;
        if( i < arr.length){
            int largestIndx = largestNumberIndex(arr,start,end);
            swap(arr,largestIndx,end);
            selectionSortRecursion(arr,i+1);
        }
    }

    private static void swap(int[] arr, int largestIndx, int end) {
        int temp = arr[largestIndx];
        arr[largestIndx] =  arr[end];
        arr[end] = temp;
    }

    private static int largestNumberIndex(int[] arr,int start,int end){
        int largestNumIndex = start;
        for (int i = start; i <= end ; i++) {
            if(arr[largestNumIndex] < arr[i]){
                largestNumIndex = i;
            }
        }
        return largestNumIndex;
    }
}
