public class StringManiulation {
    public static void main(String[] args) {
        String str = "ACCESS";
        String duplicate = "";
        String nonduplicate = "";
        for (int i = 0; i < str.length(); i++) {
            if(nonduplicate.indexOf(str.charAt(i)) < 0){
                nonduplicate = nonduplicate+str.charAt(i);
            }else{
                duplicate = duplicate+str.charAt(i);
            }
        }
        System.out.println(nonduplicate);
        System.out.println(duplicate);
        /****************Palindrome check******************/
        String str1 ="race e car";
        int start = 0;
        int end = str1.length()-1;
        boolean isPalidrome = checkPalindrome(str1,start,end);
        System.out.println(isPalidrome);
        String testStr = " SUCCESS ";
        String test1= "san"+testStr.stripLeading().stripTrailing()+"test";
        System.out.println(test1);
    }

    private static boolean checkPalindrome(String str1, int start, int end) {
        while (start < end) {
            while (start < end && !Character.isAlphabetic(str1.charAt(start))) {
                    start++;
            }
            while (start < end && !Character.isAlphabetic(str1.charAt(end))) {
                    end--;
            }
            if (str1.charAt(start) != str1.charAt(end)) {
                return false;
            }
            start++;
            end--;

        }
        return true;

        }


}
