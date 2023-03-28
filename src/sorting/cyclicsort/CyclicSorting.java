package sorting.cyclicsort;

import java.util.Arrays;
//Find out the correct index od sorted array.Cyclic sort always works on 1 to N numbers
public class CyclicSorting {
    public static void main(String[] args) {
        int[] arr = {5,3,1,2,4,6,-1};
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] > 0 && arr[i] != arr[correctIndex]){ //Ignoring negative numbers
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }
        System.out.println("Cylic soring array"+ Arrays.toString(arr));

    }

    private static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
