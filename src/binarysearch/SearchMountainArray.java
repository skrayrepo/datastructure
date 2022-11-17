package binarysearch;

public class SearchMountainArray {

    public static void main(String[] args) {
        int[] mountainArr = new int[]{1,2,3,4,5,6,7,8,7,6,3,2,1};
        int result = binarySearch(mountainArr);
        System.out.println(result);
    }
    static int binarySearch(int[] mountainArr){
        int start = 0;
        int end = mountainArr.length - 1;
        while(start < end){
            int mid = (start + end)/2;
            if(mountainArr[mid] > mountainArr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return  start;
    }
}
