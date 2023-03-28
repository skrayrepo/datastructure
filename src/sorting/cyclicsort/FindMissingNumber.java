package sorting.cyclicsort;

import java.util.Arrays;
//Google Interview Question
//https://leetcode.com/problems/missing-number/
public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = {3,7,1,2,8,4,5};
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
            int originalIndex = arr[i] - 1;
            if(arr[i] != arr[originalIndex]){
                swap(arr,originalIndex,i);
                if(arr[i] != originalIndex){
                    System.out.println(originalIndex);
                    return;
                }
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
