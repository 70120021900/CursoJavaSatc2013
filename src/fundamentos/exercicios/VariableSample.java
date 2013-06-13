package fundamentos.exercicios;

/**
 * Um programa que declara diferentes variáveis
 * e mostra os valores dessas variáveis
 */
public class VariableSample {
	public static void main(String[] args){
		// Declarar variável number do tipo integer
		// com valor inicial igual a 10
		int number = 10; 
		// Declarar variável letter do tipo character
		// com valor inicial igual a 'a'
		char letter = 'a'; 
		// Declara variável result do tipo boolean
		// com valor inicial igual a true
		boolean result = true;
		// Declarar variável str do tipo String
		// com valor inicial igual a "hello"
		String str = "hello"; 
		// Mostrar os valores das variáveis
		System.out.println("Number = " + number);
		System.out.println("letter = " + letter);
		System.out.println("result = " + result);
		System.out.println("str = " + str);
	}
}