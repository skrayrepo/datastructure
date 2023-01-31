package sorting.heapsort;

import java.util.Arrays;

public class HeapSorting {
    public static void main(String[] args) {
        int[] arr =new int[]{50,30,10,20,40,70};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void heapSort(int[] arr) {
        int length = arr.length;
        for (int i = (length/2) - 1; i >=0 ; i--) {
            covertingHeap(arr,length,i);
        }
        for (int i = length-1; i >=0 ; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            covertingHeap(arr,i,0);
        }
    }

    private static void covertingHeap(int[] arr, int length, int i) {
        int largestIndex = i;
        int leftIndex = 2*i+1;
        int rightIndex = 2*i+2;
        if(leftIndex < length && arr[leftIndex] > arr[largestIndex]){
            largestIndex = leftIndex;
        }
        if(rightIndex < length && arr[rightIndex] > arr[largestIndex]){
            largestIndex = rightIndex;
        }
        if(largestIndex != i){
            int temp = arr[i];
            arr[i] = arr[largestIndex];
            arr[largestIndex] = temp;
            covertingHeap(arr,length,largestIndex);
        }
    }
}
