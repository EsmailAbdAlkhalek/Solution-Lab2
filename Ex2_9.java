/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_9;

import java.util.Scanner;


public class Ex2_9 {

    
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.print("Input n1= ");
        int num1 = in.nextInt();
        System.out.print("Input n2= ");
        int num2 = in.nextInt();

        System.out.printf("Sum of two integers: %d%n", num1 + num2);
        System.out.printf("Difference of two integers: %d%n", num1 - num2);
        System.out.printf("Product of two integers: %d%n", num1 * num2);
        System.out.printf("Average of two integers: %.2f%n", (double) (num1 + num2) / 2);
        System.out.printf("Distance of two integers: %d%n", Math.abs(num1 - num2));
        System.out.printf("Max integer: %d%n", Math.max(num1, num2));
        System.out.printf("Min integer: %d%n", Math.min(num1, num2));
    }
    
}
