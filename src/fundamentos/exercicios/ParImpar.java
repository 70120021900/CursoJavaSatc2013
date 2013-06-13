package fundamentos.exercicios;

public class ParImpar{
	public static void main(String[] ars){
		int numero = 3;
		boolean parImpar = 3%2 == 0;
		String saida = parImpar?"Par":"Impar";
		System.out.println("O número " + numero + " é " + saida);
	}
}