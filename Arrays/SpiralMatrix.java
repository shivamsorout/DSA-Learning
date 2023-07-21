package Arrays;

public class SpiralMatrix {
    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int endRow = matrix.length-1;
        int startColumn = 0;
        int endColumn = matrix[0].length-1;
        while(startRow<=endRow && startColumn<=endColumn){
            //top
            for(int j=startColumn;j<=endColumn;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endColumn]+ " ");
            }
            //bottom
            for(int k=endColumn-1;k>=startColumn;k--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][k]+" ");
            }
            //left
            for (int l=endRow-1;l>startRow;l--){
                if(startColumn==endColumn){
                    break;
                }
                System.out.print(matrix[l][startColumn]+" ");
            }
            startRow++;
            startColumn++;
            endColumn--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        printSpiral(matrix);
    }
}
