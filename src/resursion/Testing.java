package resursion;

public class Testing {
    public static void main(String[] args) {
        Integer num = 12345;
        Integer result = 0;
        Integer result1 = reverseInt(num,result);
        System.out.println(result1);
        String str = "adffcddf";
        String res= "";
        for (int i = 0; i < str.length(); i++) {
            if(res.indexOf(str.charAt(i)) < 0){
                res = res+str.charAt(i);
            }
        }
        System.out.println(res);
    }

    private static Integer reverseInt(Integer num,Integer result) {
        if(num <= 0){
            return result;
        }
        Integer rem = num % 10;
        result = (result * 10) + rem;
        return  reverseInt(num/10,result);
    }
}
