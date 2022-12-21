package sorting.cyclicsort;

import java.util.Arrays;
//Google Interview Question
//https://leetcode.com/problems/missing-number/
public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = {3,2,0,1};
        //Convert the array in sorted order
        cyclicSort(arr);
        System.out.println("Sorted array"+ Arrays.toString(arr));
        //find missing number from sorted array
        int missingNumber = missingNumber(arr);
        System.out.println("Missing number in sorted array is"+missingNumber);
    }
    private static int missingNumber(int[] arr) {
        for(int index = 0;index < arr.length;index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
    private static void cyclicSort(int[] arr) {
        int i = 0;
        while(i < arr.length){
            if(arr[i] < arr.length && arr[i] != i){
                swap(arr,i,arr[i]);
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
