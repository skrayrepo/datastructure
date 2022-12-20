package sorting.selectionsort;

import java.util.Arrays;

public class SelectionSorting {

    public static void main(String[] args) {
        int[] array = {3,2,1,7,6,5,8,4};
        selectionSorting(array);
        System.out.println("Selection sorted array"+ Arrays.toString(array));
    }

    private static void selectionSorting(int[] array){
        for(int i = 0; i < array.length; i++){
            int start = 0;
            int end = array.length-i-1;
            int largestIndex = largestIndex(array,start,end);
            swapingLargestIndex(largestIndex,array,end);
        }
    }

    private static void swapingLargestIndex(int largestIndex, int[] array, int end) {
        int temp = array[largestIndex];
        array[largestIndex] = array[end];
        array[end] = temp;
    }

    private static int largestIndex(int[] array, int start, int end) {
        int largestIndex = start;
        for(int i=start;i<=end;i++){
            if(array[largestIndex] < array[i]){
                largestIndex = i;
            }
        }
        return largestIndex;
    }
}
