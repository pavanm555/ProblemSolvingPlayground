
public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // print diagonal
        int i = 0;
        int j = matrix[0].length-1;

        while(i<=matrix.length-1 || j>=0){
            System.out.println(matrix[i][j]);
            i++;
            j--;
        }

        // print upper triangle

        for(int k=0; k<matrix.length-1; k++){
            for(int l=0; l<matrix.length-1-k; l++){
                System.out.print(matrix[k][l] + " ");
            }
            System.out.println();
        }
    }
}
