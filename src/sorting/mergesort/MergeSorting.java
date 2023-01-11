package sorting.mergesort;

import java.util.Arrays;

public class MergeSorting {
    public static void main(String[] args) {
        int[] arr = {5,7,2,8,4,3,1,6};
        int[] mergeArr = mergeSorting(arr);
        System.out.println(Arrays.toString(mergeArr));
    }

    private static int[] mergeSorting(int[] arr) {
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] leftArr = mergeSorting(Arrays.copyOfRange(arr,0,mid));
        int[] rightArr = mergeSorting((Arrays.copyOfRange(arr,mid,arr.length)));
        int[] mergeArr = merge(leftArr,rightArr);
        return mergeArr;
    }

    private static int[] merge(int[] leftArr,int[] rightArr){
        int[] result = new int[leftArr.length+rightArr.length];
        int i = 0;int j = 0;int k = 0;
        while(i < leftArr.length && j < rightArr.length){
            if(leftArr[i] < rightArr[j]){
                result[k] = leftArr[i];
                i++;
            }else{
                result[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while(i < leftArr.length){
            result[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightArr.length){
            result[k] = rightArr[j];
            j++;
            k++;
        }
        return result;
    }
}
