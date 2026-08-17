import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in); 
        try { 
            System.out.print("Enter rows and cols for Matrix A: "); 
            int rA = sc.nextInt(); int cA = sc.nextInt(); 
            int[][] A = new int[rA][cA]; 
            for(int i=0; i<rA; i++) for(int j=0; j<cA; j++) A[i][j] = sc.nextInt(); 
 
            System.out.print("Enter rows and cols for Matrix B: "); 
            int rB = sc.nextInt(); int cB = sc.nextInt(); 
            int[][] B = new int[rB][cB]; 
            for(int i=0; i<rB; i++) for(int j=0; j<cB; j++) B[i][j] = sc.nextInt(); 
            //MatrixMultiplication mm = new MatrixMultiplication();
            int[][] result =  new MatrixMultiplication().multiplyMatrices(A, B,rA,cB); 
            System.out.println("Resulting Matrix:"); 
            for(int[] row : result) System.out.println(Arrays.toString(row)); 
            
        } catch (MatrixMismatchException e) { 
            System.out.println("Error: " + e.getMessage()); 
            
        } finally { sc.close(); } 
    }
	
}