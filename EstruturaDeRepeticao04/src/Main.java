/*
 * Este programa irá contar até o valor que o usuário especificar.
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
		
		//Perguntando ao usuário e declarando as variáveis ate e count.
		System.out.print("Ate quanto contar? ");
		int ate = input.nextInt(); //Passando o valor de entrada para a variável ate.
		int count = 0;
		
		do{ //Inicio do laço.
			count++; //Adcionando mais um à variável count.
			//Imprimindo a contagem.
			System.out.printf("%s contando...\n", count);
		//Faça enquanto a variável count for menor que a variável ate.
		}while(count < ate);
	}
}
