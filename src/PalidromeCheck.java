public class PalidromeCheck {
    public static void main(String[] args) {
        int[] num = {1,2,3,2,1};
        boolean isPolidrome = palindromeCheck(num);
        System.out.println(isPolidrome);
    }

    private static boolean palindromeCheck(int[] num) {
        int start = 0;
        int end = num.length -1;
        while(start <= end){
            if(num[start] == num[end]){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
