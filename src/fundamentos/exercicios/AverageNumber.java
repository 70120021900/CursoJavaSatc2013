package fundamentos.exercicios;

/**
 * Um programa que calcula a média de três
 * números: 10,20, e 45
 * e imprime o resultado na tela
 */
public class AverageNumber {
	public static void main(String[] args){
		// Declarar três números
		int num1 = 10;
		int num2 = 20;
		int num3 = 45;
		// Obter a média dos números e guardar na variável ave
		int ave = (num1+num2+num3)/3;
		// Mostrar
		System.out.println("number 1 = " + num1);
		System.out.println("number 2 = " + num2);
		System.out.println("number 3 = " + num3);
		System.out.println("Average is = " + ave);
	}
}