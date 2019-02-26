/*
 * Este programa irá contar a partir de um número definido pelo usuário até outro
 * número maior também definido pelo usuário.
 */

/**
 * @author Proton
 * @version 1.0
 * @since 2019-02-26
 */

//Importando a classe Scanner.
import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		//Declarando a variável input com o objeto Scanner.
		Scanner input = new Scanner(System.in);

		int de; //Declarando a variável de.
		int ate; //Declarando a variável ate.
		
		//Perguntando e armazenando o valor digitado pelo usuário na variável de.
		System.out.print("De onte contar? ");
		de = input.nextInt();
		
		do{ //Início do laço.
			
			//Perguntando e armazenado o valor digitado pelo usuário na variável ate.
			System.out.print("Até quanto contar? ");
			ate = input.nextInt();

			if(ate < de){ //Se "ate" for menor que "de" exiba a mensagem.
				System.out.printf("O valor tem que ser maior que %s!\n", de);
			}
		//Repete o processo até que o usuário digite um número maior válido.
		}while(ate < de);
		
		//Laço que faz a contagem de um valor ate um valor maior.
		for(int i = de; i <= ate; i++){
			//Exibe a ontagem.
			System.out.printf("%s contando...\n", i);
		}
	}
}
