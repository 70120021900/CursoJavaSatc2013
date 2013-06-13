package entradadados.exercicios;

import java.io.*;

public class EntradaBufferedReader{

	public static void main(String[] args){
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("Palavra 1:");
			String palavra1 = dataIn.readLine();
			System.out.println("Palavra 2:");
			String palavra2 = dataIn.readLine();
			System.out.println("Palavra 3:");
			String palavra3 = dataIn.readLine();
			System.out.println(palavra1 + " " + palavra2 + " " + palavra3);
		}catch(IOException e){
			System.out.println("Erro");
		}
		
	}
}