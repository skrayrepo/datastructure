package linearsearch;

import java.util.Arrays;

public class SearchMaxValueIn2DArray {

    public static void main(String[] args) {
        int[][] twoDimArray = {
                {22,45,66,33,55},
                {98,56,23,12},
                {66,77,42},
                {18,39}
        };
        System.out.println(Arrays.deepToString(twoDimArray));
        searchLargestElement(twoDimArray);
        searchSmallestElement(twoDimArray);
    }

    public static void searchLargestElement(int[][] twoDimArray){
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length ; j++) {
                if(twoDimArray[i][j] > maxValue){
                    maxValue = twoDimArray[i][j];
                }
            }
        }
        System.out.println("Largest element is" +maxValue);
    }

    public static void searchSmallestElement(int[][] twoDimArray){
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length ; j++) {
                if(twoDimArray[i][j] < minValue){
                    minValue = twoDimArray[i][j];
                }
            }
        }
        System.out.println("Smallest element is" +minValue);
    }
}
