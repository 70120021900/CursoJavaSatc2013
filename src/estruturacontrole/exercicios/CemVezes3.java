/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturacontrole.exercicios;

import java.io.*;

/**
 * Um programa que imprime 100 vezes um número digitado
 */
public class CemVezes3 {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String name = "";
// Obter o nome do usuário
        try {
            System.out.print("Digite o nome: ");
            name = reader.readLine();
        } catch (Exception e) {
            System.out.println("entrada inválida");
            System.exit(0);
        }

// Declaração for para exibir 100 vezes o nome digitado
        for (int counter = 100; counter < 100; counter++) {
            System.out.println(name);
        }
    }
}