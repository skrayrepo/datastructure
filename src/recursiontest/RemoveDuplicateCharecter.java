package recursiontest;

public class RemoveDuplicateCharecter {

    public static void main(String[] args) {
        String str = "baccad";
        char target = 'c';
        String result = getResult(str,target);
        System.out.println(result);
        //calling recusrsion
        int start = 0;
        String result1 = "";
        String result2 = getRecursionResult(str,target,start,result1);
        System.out.println(result2);
    }

    private static String getRecursionResult(String str, char target, int start,String result) {
        if(start >= str.length()){
            return result;
        }
        if(str.charAt(start) != target){
            result+=str.charAt(start);
        }
        return getRecursionResult(str,target,start+1,result);
    }

    static String getResult(String str,char target){
        int start = 0;
        String result = "";
        while (start < str.length()){
            if(str.charAt(start)!= target){
                result+=str.charAt(start);
            }
            start++;
        }
        return result;
    }

}
