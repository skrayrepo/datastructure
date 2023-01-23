package multidimentionarray;

public class CountRowAndColumn {

    public static void main(String[] args) {
       int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print("("+row+","+col+")");
            }
            System.out.println(" ");
        }
    }
}
