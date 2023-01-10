package resursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIndNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,4,5};
        int target = 4;
        int i = 0;
        List list = new ArrayList<>();
        list = findNumbers(arr,i,target,list);
        System.out.println(Arrays.toString(list.toArray()));
    }

    private static List findNumbers(int[] arr,int i, int target,List list) {
        if(i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }
        return findNumbers(arr,i+1,target,list);
    }
}
