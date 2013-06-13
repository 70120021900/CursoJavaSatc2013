package entradadados.exemplos;

import java.util.Scanner;

public class TesteScanner{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o seu nome:");
		String name = sc.next();
		System.out.println("Ola " + name +"!");
	}
	
}