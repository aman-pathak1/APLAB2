public class MatrixMultiplication { 
    public static int[][] multiplyMatrices(int[][] A, int[][] B,int rA,int cB) throws MatrixMismatchException { 
    try{
        if(A[0].length!=B.length){
            throw new MatrixMismatchException("Matrix cannot be multiply, because column of A is not equal to row of B");
        }
    } catch(MatrixMismatchException e){
         System.out.println("Error: " + e.getMessage());
    }
    int result[][] = new int[rA][cB];
    for(int i=0; i<rA; i++){
        for(int j=0; j<cB; j++){
            for(int k=0; k<B.length; k++){
                result[i][j] = A[i][k] * B[k][j];
            }
        }
    }
    
    return result; 
}
}
