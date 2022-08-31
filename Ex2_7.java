/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_7;

/**
 *
 * @author SCC
 */
public class Ex2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //اولا ازالة الحرف الاول
        String str = "fatima";
        System.out.println(str.substring(1,str.length() - 1));
     // ثانيا طباعة الحرف الاول ولاخير فقط
     System.out.print(str.substring(0,str.length()-5 ));
     System.out.println(str.substring(5,str.length()-0 ));
    }
    
}
