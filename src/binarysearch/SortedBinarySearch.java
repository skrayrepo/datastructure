package binarysearch;

public class SortedBinarySearch {
    public static void main(String[] args) {
        int result;
        //int[] arr = new int[]{10, 20, 30, 40, 50, 60, 70,80}; //Ascending Array
        int[] arr = new int[]{80,70,60,50,40,30,20,10}; //Descending Array
        //find out the given array is in ascending or descending order
        if(arr[0] < arr[arr.length -1]){
             result = ascBinarySearch(arr,40);
        }else{
             result = dscBinarySearch(arr,40);
        }
        System.out.println("Element found at"+result);
    }

    public static int ascBinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static int dscBinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(target > arr[mid]){
                end = mid - 1;
            }else if(target < arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
