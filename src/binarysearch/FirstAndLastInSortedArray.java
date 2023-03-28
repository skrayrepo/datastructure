package binarysearch;

import java.util.Arrays;

public class FirstAndLastInSortedArray {

    public static void main(String[] args) {
        int[] arr = new int[]{5,7,7,8,8,8,8,10};
        int target = 8;
        int[] result = new int[]{-1,-1};
        //Find first and last index of the target number
        int startPosition= SearchBinary(arr,target,true);
        int endPosition= SearchBinary(arr,target,false);
        result[0] = startPosition;
        result[1] = endPosition;
        System.out.println(Arrays.toString(result));
    }


    public static int SearchBinary(int[] arr, int target,boolean startPosition){
        int start = 0;
        int end = arr.length -1;
        int result = -1;
        while(start <= end){
            int mid = (start+end)/2;
            if (target > arr[mid]) {
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                result = mid;
                if (startPosition) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return result;
    }


}
