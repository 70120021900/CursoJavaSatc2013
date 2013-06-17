/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classesobjetos.exemplos;

/**
 *
 * @author Klaus Boeing
 */
public class Comparar {

    public static void main(String[] args) throws InterruptedException {
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(10);
                
//        System.out.println(num1 == num2);
//        System.out.println(num1.equals(num2));
 
        Integer a = -128;
        Integer b = -128;
        
        System.out.println(a == b);
        System.out.println(a.equals(b));
        
        Integer g = -129;
        Integer h = -129;
        
        System.out.println(g == h);
        System.out.println(g.equals(h));
        
    }
    
}
