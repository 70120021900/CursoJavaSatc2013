/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturacontrole.exercicios;

import javax.swing.JOptionPane;

/**
 * Transforma uma entrada numérica entre 1-10 para palavras utilizando if-else
 */
public class NumWords2 {

    public static void main(String[] args) {
        String msg = "";
        int input = 0;
// Obter a entrada
        input = Integer.parseInt(JOptionPane.showInputDialog("Digite número"));

        switch (input) {
            case 1:
                msg = "um";
                break;
            case 2:
                msg = "dois";
                break;
            case 3:
                msg = "três";
                break;
            case 4:
                msg = "quatro";
                break;
            case 5:
                msg = "cinco";
                break;
            case 6:
                msg = "seis";
                break;
            case 7:
                msg = "sete";
                break;
            case 8:
                msg = "oito";
                break;
            case 9:
                msg = "nove";
                break;
            case 10:
                msg = "dez";
                break;
            default:
                msg = "número inválido";
        }

        JOptionPane.showMessageDialog(null, msg);
    }
}
