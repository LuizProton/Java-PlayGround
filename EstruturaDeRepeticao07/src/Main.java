/*
 * Este programa irá exibir uma lista de itens e subitens com base nos valores definidos 
 * pelo usuário.
 */

/**
 * @author Proton
 * @version 1.0
 * @since 2019-02-26
 */

//Importando a classe Scanner
import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{

		//Declarando as variáveis "itens" e "subitens".
		int itens;
		int subitens;
		
		//Declarando a variável input com o objeto Scanner.
		Scanner input = new Scanner(System.in);

		//Perguntando e armazenando o valor digitado pelo usuário na variável "itens".
		System.out.print("Quantos itens?: ");
		itens = input.nextInt();
		
		//Perguntando e armazenando o valor digitado pelo usuário na variável "subitens".
		System.out.print("Quantos subitens?: ");
		subitens = input.nextInt();
		
		//Iniciando o laço do item.
		for(int i = 1; i <= itens; i++){
			
			//Imprime o número do item.
			System.out.printf("Item %s.0:\n", i);
			
			//Iniciado o laço do subitem.
			for(int j = 1; j <= subitens; j++){

				//Imprime o numero do subitem.
				System.out.printf("  Subitem %s.%s;\n", i,j);
			}
		}
	}
}
