
package ex2_5;


public class Ex2_5 {

    
    public static void main(String[] args) {
        int x = 100, y = 200;
 
 
        int temp = x;
        x = y;
        y = temp;
        //بعد التبديل
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
    
}
