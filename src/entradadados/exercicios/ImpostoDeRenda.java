package entradadados.exercicios;


import java.util.Scanner;

public class ImpostoDeRenda{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com a Renda Mensal: ");
		double rendaMensal = sc.nextDouble();
		
		double percentual = rendaMensal <= 1164 ? 0: 
								(rendaMensal >= 1164.01 && rendaMensal <= 2326.00 ? 15:27 );
		
		double impostoRenda = (rendaMensal * (percentual /100));
		
		System.out.println("Imposto de Renda: " + impostoRenda);
		System.out.println("Percentual Aplicado: " + percentual + "%");
	}

}