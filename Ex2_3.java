/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_3;

public class Ex2_3 {

    
    public static void main(String[] args) {
        double width = 5.6;
        double height = 8.5;

        double perimeter = 2*(height + width);
        double area = width * height;			
		
        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);
        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
    }
    
}
