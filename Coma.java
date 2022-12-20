
package coma;

import java.util.Scanner;

/**
 *
 * @author ranaemad
 */
public class Coma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String str = new String();
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        String stri = str.replace(",", "");
        System.out.print(stri);    
        }
    
}
