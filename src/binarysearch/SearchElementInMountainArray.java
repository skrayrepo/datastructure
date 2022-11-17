package binarysearch;

public class SearchElementInMountainArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1,4,5,6,7,6,3,2};
        int target = 3;
        //we have to split the array into two parts by using peak and do binary search both asc and desc array
        int peak = findPeakOfTheArray(arr);
        int result = binarySearch(arr,target,0,peak);
        if(result == -1){
            result = binarySearch(arr,target,peak+1,arr.length - 1);
        }
        System.out.println(result);
    }

    static int findPeakOfTheArray(int[] mountainArr){
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

    static int binarySearch(int[] arr,int target,int start,int end){
        while(start <= end){
            int mid = (start+end)/2;
            boolean asc = arr[start] < arr[end];
                if (target > arr[mid]) {
                    if(asc)
                        start = mid + 1;
                    else
                        end = mid - 1;
                } else if (target < arr[mid]) {
                    if(asc)
                        end = mid - 1;
                    else
                        start = mid + 1;
                } else {
                    return mid;
                }
        }
        return  -1;
    }
}
