import java.util.Arrays;

public class MultiDimensionalPattern {
    public static void main(String[] args) {
        int n =5;
        System.out.println("---------Pattrn 1------------");
        pattern1(n);
        System.out.println("---------Pattrn 2------------");
        pattern2(n);
        System.out.println("---------Pattrn 3------------");
        pattern3(n);
        System.out.println("---------Pattrn 4------------");
        pattern4(n);
        System.out.println("---------Pattrn 5------------");
        pattern5(n);
        System.out.println("---------Pattrn 6------------");
        pattern6(n);
    }

    private static void pattern1(int n) {
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }


    private static void pattern2(int n) {
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    private static void pattern3(int n) {
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <=n-row ; col++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    private static void pattern4(int n){
        for (int row = 1; row <= 2*n-1 ; row++) {
            if(row <= n){
                for (int col = 1; col <= row ; col++) {
                    System.out.print("*"+" ");
                }
            }else{
                for (int col = 1; col <= 2*n-row ; col++) {
                    {
                        System.out.print("*"+" ");
                    }

                }
            }
            System.out.println();
        }
    }

    private static void pattern5(int n){
        for (int row = 1; row <= 2*n-1 ; row++) {
            int totalRow = row <=n?row:2*n-row;
            int totalSpaces = n - totalRow;
            for (int s = 1; s <= totalSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalRow ; col++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }

    private static void pattern6(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
