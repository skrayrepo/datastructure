import java.util.Arrays;

public class Testing1 {
    public static void main(String[] args) {
        int[] arr = {4,1,3,2,5};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr1 = {1,0,1,0,0,1,0};
        arrange(arr1);
    }

    private static void arrange(int[] arr1) {
        for (int i = 0; i < arr1.length-1 ; i++) {
            for (int j = i+1; j < arr1.length ; j++) {
                if(arr1[j] != arr1[j-1]){
                    swapingArray(arr1,j,j-1);
                }
            }

        }
        System.out.println("Arry swaping "+Arrays.toString(arr1));
    }

    private static void swapingArray(int[] arr1, int j, int i) {
        int temp = arr1[j];
        arr1[j] =  arr1[i];
        arr1[i] = temp;
    }

    private static void cyclicSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swapArray(arr,i,correctIndex);
            }
        }
    }

    private static void swapArray(int[] arr, int i, int correctIndex) {
        int temp = arr[correctIndex];
        arr[correctIndex] = arr[i];
        arr[i] = temp;
    }
}
