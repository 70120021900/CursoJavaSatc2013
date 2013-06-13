package estruturacontrole.exercicios;

import java.io.*;

/**
 * Obt�m tr�s entradas num�ricas do usu�rio e mostra a m�dia na tela
 */
public class Notas1 {

    public static void main(String[] args) {
// Declarar a variavel reader como entrada
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int primeiraNota = 0;
        int segundaNota = 0;
        int terceiraNota = 0;

        double average = 0;
        try {
            System.out.print("Primeira nota: ");
            primeiraNota = Integer.parseInt(reader.readLine());
            System.out.print("Segunda nota: ");
            segundaNota = Integer.parseInt(reader.readLine());
            System.out.print("Terceira nota: ");
            terceiraNota = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println("Entrada invalida");
            System.exit(0);
        }
// Calcular a media
        average = (primeiraNota + segundaNota + terceiraNota) / 3;
// Mostrar a media dos tres exames
        System.out.print("Media: " + average);
        if (average >= 60) {
            System.out.print(" :-)");
        } else {
            System.out.print(" :-(");
        }
    }
}