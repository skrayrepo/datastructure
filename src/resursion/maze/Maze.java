package resursion.maze;

public class Maze {
    public static void main(String[] args) {
        int count = count(4,3);
        //Find the number of way to traverse the maze
        System.out.println(count);
        //find the path to traverse the maze
        findPath("",3,3);
        System.out.println("******************");
        findDiagonalPath("",3,3);
        System.out.println("******************");
        boolean[][] restrictionMatrix = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        findPathWithRestriction("",0,0,restrictionMatrix);
    }

    private static void findPath(String path, int row, int col) {
        if(row == 1 && col == 1){
            System.out.println(path);
            return;
        }

        if(row > 1){
            findPath(path+"D",row - 1,col);
        }
        if(col > 1){
            findPath(path+"R",row,col - 1);
        }
    }

    private static void findDiagonalPath(String path, int row, int col) {
        if(row == 1 && col == 1){
            System.out.println(path);
            return;
        }

        if(row > 1 && col > 1){
            findDiagonalPath(path+"D",row - 1,col - 1); //D stands for diagonal traverse
        }
        if(row > 1){
            findDiagonalPath(path+"V",row - 1,col); // V stands for vertical traverse
        }
        if(col > 1){
            findDiagonalPath(path+"H",row,col - 1); //H stans for Horizontal traverse
        }
    }

    private static void findPathWithRestriction(String path, int row, int col, boolean[][] restrictMatrix) {
        if(row == restrictMatrix.length - 1 && col == restrictMatrix[0].length - 1){
            System.out.println(path);
            return;
        }

        if(!restrictMatrix[row][col]){ //restriction on 2,2
            return;
        }
        if (row < restrictMatrix.length - 1) {
            findPathWithRestriction(path+"D",row + 1,col,restrictMatrix);
        }
        if(col < restrictMatrix[0].length - 1){
            findPathWithRestriction(path+"H",row,col + 1,restrictMatrix);
        }
    }

    private static int count(int V, int H) { //V for vertical and H for horizontal traverse
        if(V == 1 || H == 1){
            return 1;
        }
        int left = count(V - 1,H);
        int right =  count(V,H-1);
        return left + right;
    }
}
