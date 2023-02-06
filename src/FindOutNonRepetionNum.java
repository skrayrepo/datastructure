public class FindOutNonRepetionNum {
    public static void main(String[] args) {
        int[] arr = {2,5,2,4,3,2,4,2};
        boolean match = false;
        for (int i = 0; i < arr.length; i++) {
            match = false;
            for (int j = arr.length-1; j > 0; j--) {
                    if (arr[i] == arr[j] && i != j) {
                        match = true;
                        break;
                    }
            }
            if(!match){
                System.out.println(arr[i]);
            }
        }
    }
}
