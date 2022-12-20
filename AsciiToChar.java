/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asciitochar;
import java.util.Scanner;

/**
 *
 * @author ranaemad
 */
public class AsciiToChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //taking the ASCII code from the user 
        System.out.println("Please Enter The ASCII Code: ");
        Scanner input = new Scanner(System.in);
        int asc = input.nextInt();
        
        // converting the ASCII code to character
        char character = (char)asc;
        
        // printing the result
        System.out.println("The Character of The " +asc+" ASCII Is : "+ character);
        
    }
    
}
