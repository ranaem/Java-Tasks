
package matrix;

import java.util.Scanner;

/**
 *
 * @author ranaemad
 */
public class Matrix {

    
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
        
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                if( j > i){
                 int x;
                    x = matrix[j][i];
                    matrix[j][i] = matrix[i][j];
                    matrix[i][j] = x;
                }
            }
        }
        System.out.println(" The transposed matrix : ");
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.print(matrix[i][j]+ "  ");
            }
            System.out.println();
        }
        
        
    }
    
}
