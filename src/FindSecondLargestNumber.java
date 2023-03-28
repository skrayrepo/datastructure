public class FindSecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {9,4,7,1,3,8,10,13,19};
        //first sort the array in ascending order by bubble sort then find second largest
        findSecondLargestNumber(arr);
    }

    private static void findSecondLargestNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length ; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                     arr[j] = arr[j-1];
                     arr[j-1] = temp;
                }
            }

        }
        System.out.println("Second largest number is "+arr[arr.length - 2]);
    }
}
