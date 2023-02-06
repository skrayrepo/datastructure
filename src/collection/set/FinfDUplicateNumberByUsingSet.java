package collection.set;

import java.util.*;

public class FinfDUplicateNumberByUsingSet {
    public static void main(String[] args) {
        int[] arr = {5,3,4,3,5,4,3,3,6,4};
        findDuplicateNumber(arr);
    }

    private static void findDuplicateNumber(int[] arr) {
        Set<Integer> hashSet = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();
        for(Integer num:arr){
            if(!hashSet.add(num) && resultList!=null && !resultList.contains(num)){
                resultList.add(num);
            }
        }
        System.out.println("Duplicate number is:"+ Arrays.toString(resultList.toArray()));
    }
}
