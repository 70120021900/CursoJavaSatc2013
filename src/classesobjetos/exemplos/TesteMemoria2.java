/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classesobjetos.exemplos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Klaus Boeing
 */
public class TesteMemoria2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 100000000; i++) {
            
            int num = 12;
            
            list.add("oooooooooooooooooooooo"
                    + "ooooooooooooooooooooo"
                    + "ooooooooooooooooooooo"
                    + "ooooooooooooooooooooo"
                    + "oooooooooooooooooooooo"
                    + "oooooooooooooooooooooo"
                    + "ooooooooooooooooooooooo"
                    + "ooooooooooooooooooooooo"
                    + "ooooooooooooooooooooooo"
                    + "ooooooooooooooooooooooo"
                    + "oooooooooooooooooo"
                    + "oooooooooooooooo"
                    + "ooooooo"
                    + "oooooooooo"
                    + "ooooooooooooooooooo"
                    + "oooooooooooooooooooo"
                    + "oooooooooooooooooo"
                    + "o"
                    + "o"
                    + "ooooooooo");
        }
    }
    
}
