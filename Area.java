
package area;

import java.util.Scanner;

/**
 *
 * @author ranaemad
 */
public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c = new Circle();
        Scanner input = new Scanner(System.in);
        int r;
        System.out.println("Please Enter The Diameter ");
        r = input.nextInt();
        c.area(r);
        c.circumference(r);
        triangle t = new triangle();
        int h,b,A,B,C;
        System.out.println("Please Enter The base and height ");
        b = input.nextInt();
        h = input.nextInt();
        t.area(b, h);
        System.out.println("Please Enter The Length Of Sides ");
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        t.circumference(A, B, C);
        
        
    }
    
}
