import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] numArray = new int[]{1,4,5,8,6,9};
        System.out.println("Before Array Swapping" +Arrays.toString(numArray));
        int start = 0;
        int end = numArray.length -1;
        while( start < end){
            swap(numArray,start,end);
            start++;
            end--;
        }
        System.out.println("After Array Swapping" +Arrays.toString(numArray));
    }

    public static void swap(int[] numArray,int start, int end){
        int temp = numArray[start];
        numArray[start] = numArray[end];
        numArray[end] = temp;
    }
}
