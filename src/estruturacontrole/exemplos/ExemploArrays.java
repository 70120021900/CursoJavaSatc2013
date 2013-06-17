/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturacontrole.exemplos;

/**
 *
 * @author Klaus Boeing
 */
public class ExemploArrays {

    public static void main(String[] args) {

        String[][] pessoas2 = {
            {"klaus", "klaus@gmail", "teste"},
            {"mario", "mario@gmail.com", "teste 2"},
            {"jean", "jean@gmail.com", "teste 3"}
        };
        
        String[][] pessoas = new String[3][3];

        pessoas[0][0] = "klaus";
        pessoas[0][1] = "klaus@gmail";
        pessoas[0][2] = "teste";

        pessoas[1][0] = "mario";
        pessoas[1][1] = "mario@gmail";
        pessoas[1][2] = "teste2";

        pessoas[2][0] = "cleber";
        pessoas[2][1] = "cleber@gmail";
        pessoas[2][2] = "teste3";

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i][0]);
            System.out.println(pessoas[i][1]);
            System.out.println(pessoas[i][2]);
        }

        for (int i = 0; i < pessoas.length; i++) {
            for (int y = 0; y < pessoas[i].length; y++) {
                System.out.println(pessoas[i][y]);
            }
        }

    }
}
