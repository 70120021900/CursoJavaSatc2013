package entradadados.exemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteBufferedReader{

	public static void main(String[] args){
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

		String nome = "";
		System.out.print("Entre com o seu nome:");

		try {
			nome = dataIn.readLine();
		} catch (IOException e) {
			System.out.println("Error!");
		}

		System.out.println("Ola " + nome +"!");
	}
	
}