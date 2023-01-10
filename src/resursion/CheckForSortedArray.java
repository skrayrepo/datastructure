package resursion;

public class CheckForSortedArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,9,10};
        int i = 0;
        boolean isSorted = checkSortedArray(arr,i);
        System.out.println(isSorted);
    }

    private static boolean checkSortedArray(int[] arr, int i) {
        if(i == arr.length -1){
            return true;
        }
        if(arr[i] < arr[i+1]){
            return checkSortedArray(arr,i+1);
        }else{
            return false;
        }

    }
}
