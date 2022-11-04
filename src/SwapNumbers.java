import java.sql.Array;
import java.util.Arrays;

public class SwapNumbers {
    public static void main(String[] args) {
        int[] numArray = new int[]{25,35,45,55,65,75,85};
        int index1 = 1;
        int index2 = 4;
        int temp = numArray[index1];
        numArray[index1] = numArray[index2];
        numArray[index2] = temp;
        System.out.println(Arrays.toString(numArray));

    }

}
