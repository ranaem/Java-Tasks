
package transposematrix;

import java.util.Scanner;

/**
 *
 * @author ranaemad
 */
public class TransposeMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the size of matrix : ");
        a = input.nextInt();
        b = input.nextInt();
        int[][] matrix = new int[a][b];
        System.out.println("Please enter the matrix : ");
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("The original matrix : ");
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.print(matrix[i][j]+ "  ");
            }
            System.out.println();
        }
        int[][] transpose = new int[a][b];
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        
        System.out.println(" The transposed matrix : ");
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.print(transpose[i][j]+ "  ");
            }
            System.out.println();
        }
    }
    
}
