package sorting.cyclicsort;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMultipleMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        //Convert the array in sorted order
        cyclicSort(arr);
        System.out.println("Sorted array"+ Arrays.toString(arr));
        //find missing number from sorted array
        ArrayList<Integer> missingNumber = missingNumber(arr);
        System.out.println("Missing number in sorted array is"+Arrays.toString(missingNumber.toArray()));
    }
    private static ArrayList<Integer> missingNumber(int[] arr) {
        ArrayList<Integer> missingElements = new ArrayList<Integer>();
        for(int index = 0;index < arr.length;index++){
            if(arr[index] != index +1){
                missingElements.add(index+1);
            }
        }
        return missingElements;
    }
    private static void cyclicSort(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,correctIndex,i);
            }else{
                i++;
            }
        }
    }
    private static void swap(int[] arr, int correctIndex, int i) {
        int temp = arr[correctIndex];
        arr[correctIndex] = arr[i];
        arr[i] = temp;

    }
}
