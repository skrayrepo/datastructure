public class MaximumMinimumValue {
    public static void main(String[] args) {
        int[] arr = new int[]{56,99,11,145,56,9};
        System.out.println("Array size"+arr.length);
        int maxValue = arr[0];
        int minValue = arr[0];
        for(int i = 0 ;i < arr.length; i++){
            if(arr[i] > maxValue)
                maxValue = arr[i];
        }
        System.out.println("Maximum value"+ maxValue);
        for(int i = 0 ;i < arr.length; i++){
            if(arr[i] < minValue)
                minValue = arr[i];
        }
        System.out.println("Minimum value"+ minValue);
    }
}
