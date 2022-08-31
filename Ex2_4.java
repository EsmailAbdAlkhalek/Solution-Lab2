/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_4;

import java.util.Scanner;

/**
 *
 * @author SCC
 */
public class Ex2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x,y,z,avg;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter three Number ");
        x=in.nextDouble();
        y=in.nextDouble();
        z=in.nextDouble();
        avg=x+y+z/3.0;
        System.out.println("The Average is "+avg);
    }
    
}
