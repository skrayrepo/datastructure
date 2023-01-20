package sorting;

import java.util.Arrays;

public class QuickSorting {
    public static void main(String[] args) {
        int[] arr = {4,6,2,7,5,3,1};
        int low = 0;
        int high = arr.length -1;
        quickSorting(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSorting(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int m = s + e / 2;
        int pivot = nums[m];

        while (s <= e) {

            // also a reason why if its already sorted it will not swap
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at correct index, please sort two halves now
        quickSorting(nums, low, e);
        quickSorting(nums, s, high);
    }
}
