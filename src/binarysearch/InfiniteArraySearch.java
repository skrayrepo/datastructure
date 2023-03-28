package binarysearch;

public class InfiniteArraySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40,50,60,70,80,90,
        100,110,120,130,140,150};
        int target = 50;
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int newStart = end + 1;
            //end should be the double,so end size = previous end +size of the box*2
            end = end + (end-start+1) * 2;
            start = newStart;
        }
        int result = binarySearch(arr,target,start,end);
        System.out.println(result);
    }

    public static int binarySearch(int[] arr,int target,int start,int end){
        //int start = 0;
        //int end = arr.length - 1;
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
}
