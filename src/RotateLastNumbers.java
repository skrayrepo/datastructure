import java.util.Arrays;

public class RotateLastNumbers {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        //rotate 3 position
        int rotateCount = 3;
        rotate(arr,rotateCount);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotate(int[] arr,int rotateCount ){
        int count = 0;
        int end = arr.length -1;
        while(count < rotateCount){
            for (int i = end; i > 0 ; i--) {
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
            count++;
        }
    }
}
