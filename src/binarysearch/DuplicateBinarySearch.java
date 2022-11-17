package binarysearch;

public class DuplicateBinarySearch {

    public static void main(String[] args) {
        int[] arr = {2,2,3,4,5,6,6,6,7};
        int target = 2;
        int result = searchTargetInDuplicateArray(arr,target);
        System.out.println(result);
    }

    static int searchTargetInDuplicateArray(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(target > arr[mid]){
                start = mid+1;
            }else if(target < arr[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
