/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturacontrole.exercicios;

/**
 * Utilizar um array de string para salvar os dias da semana e imprime na tela.
 */
public class DiasDaSemana3 {

    public static void main(String[] args) {
// Declarar o array de String dos dias da semana
        String[] days = {"Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"};

// Declaração for para mostrar os dias da semana
        for (int counter = 0; counter < days.length; counter++) {
            System.out.println(days[counter]);
        }
    }
}
