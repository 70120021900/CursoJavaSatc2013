/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturacontrole.exercicios;

import javax.swing.JOptionPane;

/**
 * Calcula a potência de um número dados a base e expoente. O expoente está
 * limitado a números positivos.
 */
public class Powers3 {

    public static void main(String[] args) {
        int base = 0;
        int exp = 0;
        int power = 1;

// Obter entrada do usuário para base e expoente
        base = Integer.parseInt(JOptionPane.showInputDialog("Base"));
        exp = Integer.parseInt(JOptionPane.showInputDialog("Expoente"));
// Limitar variável exp a somente número positivos e maiores que 0
        if (exp <= 0) {
            JOptionPane.showMessageDialog(null,
                    "Somente números positivos e maiores que 0, por favor");
            System.exit(0);
        }

// Declaração for para calcular a potência
        for (int counter = 0; counter < exp; counter++) {
            power = power * base;
        }

// Mostrar o resultado
        JOptionPane.showMessageDialog(null,
                base + " elevado a " + exp + " é igual a " + power);
    }
}
