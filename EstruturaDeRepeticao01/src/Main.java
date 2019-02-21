/*
 * Este codigo contem uma estrutura de repetiçao que irá contar
 * de 0 a 10.
 */
 
 /**
  * @author Proton
  * @version 1.0
  * @since 2019-02-21
  */
  
public class Main{
	public static void main(String[] args){
		
		int count = 0; //Declarando e iniciando a variável count.
		
		//Bloco while que fará o loop de contagem.
		while(count < 10){
			System.out.printf("%s Contando...\n", count);
			count++;
		}
		
		//Mensagem para finalizar o programa.
		System.out.println("Fim da contage!");
	}
}
