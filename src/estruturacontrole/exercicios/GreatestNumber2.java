package estruturacontrole.exercicios;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Um programa que mostra os dados de um array multidimensional.
 */
public class GreatestNumber2 {

    public static void main(String[] args) {
        String entry[][] = {
            {"Florence", "735-1234", "Manila"},
            {"Joyce", "983-3333", "Quezon City"},
            {"Becca", "456-3322", "Manila"}};
// Declaração for para percorrer nas linhas
        for (int line = 0; line < entry.length; line++) {
            System.out.println("Name : " + entry[line][0]);
            System.out.println("Tel. # : " + entry[line][1]);
            System.out.println("Address: " + entry[line][2]);
            System.out.println();
        
        }
    }
}