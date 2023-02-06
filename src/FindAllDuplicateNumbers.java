import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindAllDuplicateNumbers {

    public static void main(String[] args) {
        int[] arr = {2,5,2,4,3,2,4,2};
        List list = findAllDuplicateNumbers(arr);
        System.out.println(Arrays.toString(list.toArray()));
    }

    private static List<Integer> findAllDuplicateNumbers(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                if(arr[i] == arr[j] && i != j){
                    //Integer value = arr[i];
                    if(list != null && !list.contains(arr[i])){
                        list.add(arr[i]);
                    }
                    break;
                }
            }
        }
        return list;
    }
}
