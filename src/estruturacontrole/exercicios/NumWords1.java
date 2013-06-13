/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturacontrole.exercicios;

import javax.swing.JOptionPane;

/**
 * Transforma uma entrada numérica entre 1-10 para palavras utilizando if-else
 */
public class NumWords1 {

    public static void main(String[] args) {
        String msg = "";
        int input = 0;
// Obter a entrada
        input = Integer.parseInt(JOptionPane.showInputDialog("Digite número"));

// Declaração if para atribuir em msg o extenso do número digitado
        if (input == 1) {
            msg = "um";
        } else if (input == 2) {
            msg = "dois";
        } else if (input == 3) {
            msg = "três";
        } else if (input == 4) {
            msg = "quatro";
        } else if (input == 5) {
            msg = "cinco";
        } else if (input == 6) {
            msg = "seis";
        } else if (input == 7) {
            msg = "sete";
        } else if (input == 8) {
            msg = "oito";
        } else if (input == 9) {
            msg = "nove";
        } else if (input == 10) {
            msg = "dez";
        } else {
            msg = "número inválido";
        }

        JOptionPane.showMessageDialog(null, msg);
    }
}
