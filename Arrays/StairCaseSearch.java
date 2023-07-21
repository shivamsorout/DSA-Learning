package Arrays;

public class StairCaseSearch {
    public static boolean stairCaseSearch(int matrix[][]){
        int row = 0, col=matrix[0].length-1;
        int key=33;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("Key Found at ("+row+","+col+")");
                return true;
            } else if (key<matrix[row][col]) {
                col--;
            }
            else row++;
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        System.out.println(stairCaseSearch(matrix));
    }
}
