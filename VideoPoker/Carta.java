/**
 * Classe Carta a qual tem a funcao de sortear as cartas unitariamente
 * utilizando metodos rand()
 * @author Mateus Ferreira Gomes e Guilherme Targon Marques Barcellos
 *
 */
public class Carta {

	private int[] face = new int[2];
	Random r = new Random();
	
	/**
	 * Metodo que aleatoriza um naipe dentre os 4 possiveis
	 * @return o naipe aleatorizado em int
	 */
	private int aleatorizarNaipe() {
		int aux;
		aux = r.getIntRand(4);
		return aux;
	}
	
	/**
	 * Metodo que retorna a face de uma carta em vetor
	 * @return
	 */
	public int[] getFace() {
		return this.face;
	}
	
	/**
	 * Metodo que aleatoriza um numero de 1 a 13 para a carta
	 * @return o numero de 1 a 13
	 */
	private int aleatorizarNumero() {
		int aux;
		aux = r.getIntRand(13) + 1;
		return aux;
	}
	
	/**
	 * Metodo que utiliza da aleatorizaçao do naipe e do numero para montar uma carta
	 * @return a carta aleatorizada
	 */
	public int[] aleatorizarCarta() {
		face[0] =	aleatorizarNaipe();
		face[1] =	aleatorizarNumero();
		return face;
	}
		
}

