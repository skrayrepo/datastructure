package binarysearch;

public class FirstAndLastInSortedArray {

    public static void main(String[] args) {
        int[] arr = new int[]{5,7,7,8,8,10};
        int target = 8;
        //Find first and last index of the target number
        String result= SearchBinary(arr,target);
        System.out.println(result);
    }

    public static String SearchBinary(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        String result = "";
        while(start <= end){
            int mid = (start+end)/2;
            if (target > arr[mid]) {
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                if (arr[mid] == arr[mid+1]) {
                    return mid+","+mid+1;
                }else if(arr[mid] == arr[mid-1]){
                    return  mid-1+","+mid;
                }
            }
        }
        return result;
    }
}
