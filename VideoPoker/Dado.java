/**
 * 
 * @author Mateus Ferreira Gomes
 *
 */
public class Dado {
	
	private int lados; //Variavel que armazena o numero de lados de um dado
	private int face; //Variavel que armazena a face de cada dado
	Random r = new Random();
	
	/**
	 * Construtor para um dado de n lados (caso nao seja um dado comum de 6 lados)
	 * 
	 * @param n = numero de lados desse dado especial
	 */
	public Dado(int n){
		this.lados = n;
	}
	
	/**
	 * Cria um dado comum de 6 lados
	 */
	public Dado(){
		this.lados = 6;
	}

	/**
	 * Funcao que retorna a face atual de um dado (Getter)
	 * @return a face
	 */
	public int getLado() {
		return face;
	}
	
	/**
	 * Funcao que rola um dado
	 * @return A face resultado da rolagem desse dado
	 */
	public int rolar() {
		face =	(r.getIntRand(this.lados) + 1);
		return face;
	}
	
	@Override
	/**
	 * Funcao toString() que printa, literalmente, a face resutado da rolagem do dado
	 */
	public String toString(){
		
		switch(getLado()) {
			case 1:
				return "+-----+\n|     |\n|  *  |\n|     |\n+-----+";
				
			case 2:
				return "+-----+\n|*    |\n|     |\n|    *|\n+-----+";
			case 3:
				return "+-----+\n|*    |\n|  *  |\n|    *|\n+-----+";
			case 4:
				return "+-----+\n|*   *|\n|     |\n|*   *|\n+-----+";
			case 5:
				return "+-----+\n|*   *|\n|  *  |\n|*   *|\n+-----+";
			case 6:
				return "+-----+\n|*   *|\n|*   *|\n|*   *|\n+-----+";	
		}
		return null;
	}
	
}

		