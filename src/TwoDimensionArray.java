import com.sun.jdi.PathSearchingVirtualMachine;

public class TwoDimensionArray {

    public static void main(String[] arg){
        int matrix[][] = new int[3][4];
        int count = 1;
        System.out.println("matrix length"+matrix.length);
        for(int i=0; i < matrix.length; i++){
            System.out.println("size of array"+matrix[i].length);
            for(int j=0; j < matrix[i].length; j++){
                matrix[i][j] = count;
                count++;
            }
        }
        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();


        }
    }
}
