package resursion;

public class ReverseHalfString {
    public static void main(String[] args) {
        String str = "SANTOSH";
        String result = "";
        int mid = str.length()/2;
        boolean stop = false;
        for (int i = 0;i<mid;i++) {
            if(!stop) {
                for (int j = mid; j < str.length(); j++) {
                    result = result + str.charAt(j);
                }
            }
            result = result + str.charAt(i);
            stop = true;
        }
        System.out.println(result);
    }
}
