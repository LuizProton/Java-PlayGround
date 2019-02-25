/*
 * Este programa irá somar os valores passados pelo usuário e exibir o resultado.
 */

/**
 * @author Proton
 * @version 1.0
 * @since 2019-02-25
 */ 

//Importando a classe Scanner.
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		//Declarando a variável input com o objeto Scanner.
		Scanner input = new Scanner(System.in);
		
		//Declaramdo as variáveis numero, soma e resposta.
		int numero, soma = 0;
		String resposta;
		
		do{  //Inicio do laço.

			//Pedindo para que o usuário digite um número.
			System.out.print("Digite uma numero: ");
			numero = input.nextInt(); //Aramazenando o valor digitado na variável numero.
			
			//Somando o valor da variável numero mais a variável soma.
			soma += numero;

			//Perguntando se o usuário deseja cuntinuar.
			System.out.print("Quer continuar? Tecle s ou n: ");
			resposta = input.next(); //Armazenando a resposta digitada na variável resposta.

		//Faça enquanto o valor da variável resposta for igual à "s".	
		}while(resposta.equals("s"));
	
		//Exibindo o resultado da soma.
		System.out.printf("A soma de todos os numeros é igual a %s", soma);
	}
}
