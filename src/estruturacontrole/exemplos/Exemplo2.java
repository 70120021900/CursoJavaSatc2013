/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturacontrole.exemplos;

/**
 *
 * @author Klaus Boeing
 */
public class Exemplo2 {
    public static void main(String[] args) {
        int num=0;
        while(num < 10)
            num++;
//        System.out.println(num);
        
        num = 0;
        
        nome: do{
            num--;
            break nome;
        }while(num > 0);
        
//        System.out.println(num);
        
        for (int i=0; i++<3;){
            for (int y=0; y++<3;){
                break;
//                System.out.println(y);
            }
            System.out.println(i);
        }
        
        int[][][] num2 ={{{1},{2}}};
        String[] tr = {};
        
        System.out.println(num2);
    }
}
