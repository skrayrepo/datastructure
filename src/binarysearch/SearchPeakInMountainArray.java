package binarysearch;

public class SearchPeakInMountainArray {

    public static void main(String[] args) {
        int[] mountainArr = new int[]{2,2,6,8,4,1};
        int result = searchForPeak(mountainArr);
        System.out.println(result);
    }
    static int searchForPeak(int[] mountainArr){
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
        return  start;//return start or end as both are same
    }
}
