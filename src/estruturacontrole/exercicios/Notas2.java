/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturacontrole.exercicios;

import javax.swing.JOptionPane;

/**
 * Obtém três entradas numéricas do usuário e mostra a média na tela
 */
public class Notas2 {

    public static void main(String[] args) {
        double primeiraNota = 0;
        double segundaNota = 0;
        double terceiraNota = 0;
        double average = 0;
        try {
            primeiraNota = Double.parseDouble(JOptionPane.showInputDialog("Primeira nota"));
            segundaNota = Double.parseDouble(JOptionPane.showInputDialog("Segunda nota"));
            terceiraNota = Double.parseDouble(JOptionPane.showInputDialog("Terceira nota"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida");
            System.exit(0);
        }

        // Calcular a média
        average = (primeiraNota + segundaNota + terceiraNota) / 3;
        if (average >= 60) {
            JOptionPane.showMessageDialog(null, "Média :" + average + " :-)");
        } else {
            JOptionPane.showMessageDialog(null, "Média :" + average + " :-(");
        }
    }
}