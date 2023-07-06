//Reverter a ordem das palavras nas frases, mantendo a ordem das palavras.
//Hello, World! -> World! Hello,

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String frase;
		String[] palavra;
		System.out.println("Insira a frase: ");
		frase = input.nextLine();
		palavra = frase.split(" ");
		ArrayList<String> listaPalavras = new ArrayList();
		for (int i  = palavra.length -1; i>=0; i--) {
			listaPalavras.add(palavra[i]);
		}
		
		//forEach para percorrer a lista de palavras e adicionar cada palavra para a 
		//string fraseInversa;
		for(String fraseInversa : listaPalavras) {
			System.out.print(fraseInversa+" ");
		}
	}
}
