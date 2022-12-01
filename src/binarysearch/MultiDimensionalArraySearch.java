package binarysearch;

import java.util.Arrays;

public class MultiDimensionalArraySearch {

    public static void main(String[] args) {
        int[][] multiArr = {
                {10,20,30,40},
                {50,60,70,80},
                {90,100,110,120}
        };
        int target = 30;
        int[] result = search(multiArr,target);
        System.out.println("Result found in:"+ Arrays.toString(result));
    }

    private static int[] search(int[][] multiArr, int target) {
        int row = 0;
        int col = multiArr[0].length - 1;
        while(row < multiArr.length && col >= 0){
            if(multiArr[row][col] == target){
                return new int[]{row,col};
            }
            if(target > multiArr[row][col]){
                row ++;
            }
            else{
                col --;
            }
        }
        return new int[]{-1,-1};
    }
}
