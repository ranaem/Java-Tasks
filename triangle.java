

/**
 *
 * @author ranaemad
 */
package area;
public class triangle {
    
    public triangle(){
        
    }
    
    void area(int b, int h){
    
        double A = (h*b)/2;
        System.out.println("The Area Of The Circle : " + A);
    
    }
    void circumference(int A,int B,int D){
        
        int circum = A + B + D;
        System.out.println("The Circumference Of The Circle : " + circum);
        
    }
}
