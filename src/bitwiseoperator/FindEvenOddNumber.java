package bitwiseoperator;

public class FindEvenOddNumber {

    public static void main(String[] args) {
        int num = 8; //Converting decimal number to binary
        if((num & 1) == 1){
            System.out.println("Given number is odd");
        }else{
            System.out.println("GIven number is Even");
        }
    }
}
