package binarysearch;

public class RotationalArrayCount {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3}; //pivot is nothing but peak
        int pivot = SearchForPivot(arr);
        int pivotCount = pivot + 1;
        System.out.println(pivot);
        System.out.println("Total Number of count in rotational array is "+pivotCount);
    }

    private static int SearchForPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = (start+end)/2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
