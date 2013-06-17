/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classesobjetos.exemplos;

/**
 *
 * @author Klaus Boeing
 */
public class Casting {
    public static void main(String[] args) {
        //Implicito
        
        int num1 = 10;
        short num2 = 12;
        float num4 = 1202222222;
        double num3 = num1 + num2 + num4;
        
        System.out.println(num3);
        
        int num5 = (int)num3;
        
        
    }
    
}
