package sorting.cyclicsort;

import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class FindDuplicateNumbers {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        cyclicSorting(arr);
        System.out.println("Sorted array value "+ Arrays.toString(arr));
        ArrayList<Integer> duplicateNums = findDuplicateNumbers(arr);
        System.out.println("Duplicate Number in array "+ Arrays.toString(duplicateNums.toArray()));
    }

    private static ArrayList<Integer> findDuplicateNumbers(int[] arr) {
        ArrayList<Integer> duplicateNumbers = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1){
                duplicateNumbers.add(arr[i]);
            }
        }
        return duplicateNumbers;
    }

    private static void cyclicSorting(int[] arr) {
        int i =0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swapNumbers(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
    }

    private static void swapNumbers(int[] arr, int i, int correctIndex) {
        int temp = arr[correctIndex];
        arr[correctIndex] = arr[i];
        arr[i] = temp;
    }
}
