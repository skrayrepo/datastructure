package linearsearch;

import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] towDimArray = {
                {1,2,3,4},
                {5,6,7},
                {8,9}
        };
       // System.out.println(Arrays.toString(towDimArray).toArray());
        int target = 1;
        search(towDimArray, target);
    }

    public static boolean search(int[][] towDimArray,int target){
        for(int row =0; row < towDimArray.length; row++){
            for(int col = 0; col < towDimArray[row].length; col++){
                if(towDimArray[row][col] == target){
                    System.out.println("Target found in index"+towDimArray[row][col]);
                    return true;
                }
            }
        }
        return false;
    }
}
