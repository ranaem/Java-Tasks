

/**
 *
 * @author ranaemad
 */
package area;
        
public class Circle {
    
    public Circle(){
        
    }
    
    
    void area(int r){
    
        double are = 3.14*(r*r);
        System.out.println("The Area Of The Circle : " + are);
    
    }
    void circumference(int r){
        
        double circum = 2*3.14*r;
        System.out.println("The Circumference Of The Circle : " + circum);
        
    }
}
