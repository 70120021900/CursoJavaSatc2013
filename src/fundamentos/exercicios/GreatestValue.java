package fundamentos.exercicios;

/**
 * Um programa que imprime o número com
 * maior valor dados três números
 */
public class GreatestValue {
	public static void main(String[] args){

		// Declarar os números
		int num1 = 10;
		int num2 = 23;
		int num3 = 5;
		int max = 0;
		// Determinar qual é o maior
		max = (num1>num2)?num1:num2;
		max = (max>num3)?max:num3;
		// Mostrar
		System.out.println("número 1 = " + num1);
		System.out.println("número 2 = " + num2);
		System.out.println("número 3 = " + num3);
		System.out.println("O maior número é = " + max);
	}
}