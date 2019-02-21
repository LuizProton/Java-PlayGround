/*
 * Neste codigo é mostrado as tres formas de se declarar um variaveis e
 * os seus tipos.
 */

/**
 * @author Proton
 * @version 1.0
 * @since 2019-02-20
 */

public class Main{
	public static void main(String[] args){

		//Variaveis declaradas de forma simples
		int var_idade_simples = 25;
		float var_peso_simples = 63.56f;
		char var_letra_simples = 'A';
		boolean var_ligado_simples = false;

		//Variaveis declaradas com typecast
		int var_idade_typecast = (int) 27;
		float var_peso_typecast = (float) 57.01;
		char var_letra_typecast = (char) 'B';
		boolean var_ligado_typecast = (boolean) true;

		//Variaveis declaradas com wrapper class
		Integer var_idade_wrapper = new Integer(36);
		Float var_peso_wrapper = new Float(73.46);
		Character var_letra_wrapper = new Character('C');
		Boolean var_ligado_wrapper = new Boolean(false);

		System.out.println("Executado com suecsso!");
	}
}
