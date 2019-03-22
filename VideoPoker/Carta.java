
public class Carta {

	private int[] face = new int[2];
	Random r = new Random();
	
	private int aleatorizarNaipe() {
		int aux;
		aux = r.getIntRand(4);
		return aux;
	}
	
	public int[] getFace() {
		return this.face;
	}
	
	private int aleatorizarNumero() {
		int aux;
		aux = r.getIntRand(13) + 1;
		return aux;
	}
	
	public int[] aleatorizarCarta() {
		face[0] =	aleatorizarNaipe();
		face[1] =	aleatorizarNumero();
		return face;
	}
		
}

