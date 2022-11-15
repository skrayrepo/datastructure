package binarysearch;

public class FindingCellingOfNumber {

    public static void main(String[] args) {
        int[] arr = new int[]{5,8,15,17,19,23};
        int target = 20;
        //To find out the celling of target number
        //Celling number would be greater than equal to target number
        int cellingIndex = cellingBinarySearch(arr,target);
        System.out.println("Celling element found in index "+cellingIndex);
    }

    public static int cellingBinarySearch(int[] arr,int target){
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
        return start;
    }
}
