/*
 * Esse codigo contem uma estrutura de repetição que contará de 
 * 1 a 10 mas exibirá a mensagem "Ainda estou contando..." enquanto
 * estiver contando de 4 a 8.
 */
 
 /**
  *@author Proton
  *@version 0.1
  *@since 2019-02-20
  */
 
public class Main{
	public static void main(String[] args){
		
		//Declarando e iniciando a variável count.
		int count = 0;
		
		//Bloco while que irá realizar o loop.
		while(count < 10){
			
			//Adcionando mais um na variável count.
			count++;
			
			//Bloco condicional que irá exibir a mensagem "Ainda estou contando"
			//se a variável count for maior que 3 e menor que 9.
			if(count>3 && count <9){
				System.out.println("Ainda estou contando...");
				
				//Comando que dá continuidade ao loop ignorando o resto do bloco.
				continue;
			}
			
			//Imprime a contagem.
			System.out.printf("%s contando...\n", count);
		}
		
		//Imprime o fim da contagem.
		System.out.println("Fim da contagem!");
	}
}
