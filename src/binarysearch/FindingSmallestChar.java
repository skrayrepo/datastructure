package binarysearch;

public class FindingSmallestChar {

    public static void main(String[] args) {
        char[] array = new char[]{'b','e','h'};
        char target = 'a';
        //find out smallest character of target
        char result = findSmallestChar(array,target);
        System.out.println("Samllest number of target is " +result);
    }

    public static char findSmallestChar(char[] array,char target){
        int start = 0;
        int end = array.length -1;
        while(start <= end){
            int mid = (start+end)/2;
            if( target > array[mid] ){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return array[start];
    }
}
