/*
 * Esse programa irá contar até o valor que o usuário definir na entrada de dados.
 * O processo é feito atravez de um loop infinito que será interrompido por um break
 * quando o numero de contagem for igual ao definido pelo usuário.
 */

 /**
  * @author Proton
  * @version 1.0
  * @since 2019-02-21
  */

//Importando a classe Scanner  
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		//Instanciando um objeto Scanner na variável input.
		Scanner input = new Scanner(System.in);
		
		//Exibindo mensagem de instrução.
		System.out.print("Digite até quanto contar: ");
		
		//Armazenando a valor do input na variável ate.
		int ate = input.nextInt();
		
		//declarando e intanciando a variável count.
		int count = 0;
		
		//Bloco while que fará o loop infinito.
		while(true){
			
			//Adcionando mais um a variável count.
			count++;
			
			//Exibindo mensagem da contagem.
			System.out.printf("%s contando...\n", count);
			
			//Bloco condicional que interrompe o loop caso count seja igual a ate.
			if(count == ate){
				System.out.println("Fiz como voce pediu.");
				
				//Comando que interrompe   o loop.
				break;
			}
			
		}
	}
}
