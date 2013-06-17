/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturacontrole.exercicios;

import javax.swing.JOptionPane;

/**
 * Um programa que utiliza JOptionPane para obter dez números do usuário e
 * exibir o maior número.
 */
public class MaiorNumero1 {

    public static void main(String[] args) {
        int[] num = new int[10];
        int counter;
        int max = 0;
// Declaração for para obter 10 números do usuário
        for (counter = 0; counter < 10; counter++) {
            num[counter] = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite o número " + (counter + 1)));
// Obter o número máximo
            if (num[counter] > max) {
                max = num[counter];
            }
        }
// Mostrar o maior número
        JOptionPane.showMessageDialog(null, "O número com o maior valor é " + max);
    }
}