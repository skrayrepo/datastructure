package sorting.mergesort;

import java.util.Arrays;

public class MergingTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {2,4,5,6,8};
        int[] arr2 = {1,3,9};
        int[] result = new int[arr1.length +  arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                result[k] = arr1[i];
                i++;
            }
            else{
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i < arr1.length){
            result[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length){
            result[k] = arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(result));
    }
}
