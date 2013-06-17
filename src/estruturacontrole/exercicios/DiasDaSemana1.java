/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturacontrole.exercicios;

/**
 * Utilizar um array de string para salvar os dias da semana e imprime na tela.
 */
public class DiasDaSemana1 {

    public static void main(String[] args) {
// Declarar o array de String dos dias da semana
        String[] days = new String[7];
        
        days[0] = "Sunday";
        days[1] = "Monday";
        days[2] = "Tuesday";
        days[3] = "Wednesday";
        days[4] = "Thursday";
        days[5] = "Friday";
        days[6] = "Saturday";
       
// Declaração while para mostrar os dias da semana
        int counter = 0;
        while (counter++ < days.length) {
//            System.out.println(counter);
            System.out.println(days[counter -1]);
        }
    }
}
