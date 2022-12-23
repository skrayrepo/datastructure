import java.util.Arrays;

public class MultiDimensionalPattern {
    public static void main(String[] args) {
        int n =4;
        pattern1(n);
        pattern2(n);
        System.out.println();
        pattern3(n);
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
}
