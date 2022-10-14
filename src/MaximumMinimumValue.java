public class MaximumMinimumValue {
    public static void main(String[] args) {
        int[] arr = new int[]{56,999,11,145,56};
        System.out.println("Array size"+arr.length);
        int maxValue = -1;
        int minValue = -1;
        for(int i = 0 ;i < arr.length; i++){
            if( i == 0)
            maxValue = arr[0];
            else{
                if(arr[i] > maxValue)
                    maxValue = arr[i];
            }
        }
        System.out.println("Maximum value"+ maxValue);
        for(int i = 0 ;i < arr.length; i++){
            if( i == 0)
                minValue = arr[0];
            else{
                if(arr[i] < minValue)
                    minValue = arr[i];
            }
        }
        System.out.println("Minimum value"+ minValue);
    }
}
