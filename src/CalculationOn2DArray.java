public class CalculationOn2DArray {

    public static void main(String[] args) {
        int[][] twoDimenArray = {
                {20,30,40},
                {60,50,10},
                {10,30,50}
        };
        //find out sum of each row
        for (int i = 0; i < twoDimenArray.length ; i++) {
            int sum = 0;
            for (int j = 0; j < twoDimenArray[i].length; j++) {
                sum += twoDimenArray[i][j];
            }
            System.out.println("sum of iteration"+i+"is"+sum);
        }

    }
}
