package fundamentos.exemplos;

/**
 * Char sempre representará na saída um caracter ASCII
 */
public class Char{
	
	public static void main(String[] args){
		char caracter = 'a';
		System.out.println(caracter);
		
		//Decimal
		caracter = 97;
		System.out.println(caracter);
		
		//Unicode
		caracter = '\u0061';
		System.out.println(caracter);
		
		//Octal
		caracter = 0141;
		System.out.println(caracter);
		
		//Hexadecimal
		caracter = 0X61;
		System.out.println(caracter);

		//Número decimal da tabela ASCII
		byte testeByte = 'a';
		System.out.println(testeByte);
		
	}

}