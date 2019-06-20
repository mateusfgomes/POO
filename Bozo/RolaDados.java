/**
 * 
 * @author Mateus Ferreira Gomes
 *
 */
public class RolaDados {
	
	private int n_dados; //Numero de dados a serem rolados
	Dado[] d; //Vetor de dados que serao rolados
	
	public RolaDados(int n) {
		n_dados = n;
		d = new Dado[n];
		
		for(int i = 0; i < n_dados; i++){
			d[i] = new Dado();
		}
	}
	
	/**
	 * Funcao que rola todos os dados de uma so vez
	 * @return O vetor resultado da rolagem de todos os dados
	 */
	public int[] rolar() {
		
		int[] faces_resultado = new int[n_dados];
		Dado aux = new Dado();
		
		for(int i = 0; i < n_dados; i++) {
			aux = d[i];
			aux.rolar();
			d[i] = aux;
		}
		
		for(int i = 0; i < n_dados; i++) {
			faces_resultado[i] = d[i].getLado();
		}
		
		return faces_resultado;
		
	}
	
	/**
	 * Funcao que rola, conforme um vetor de booleanos, os dados desejados 1 para dado a rolar, 0 para dado a nao rolar
	 * @param quais O vetor de booleanos a serem rolados
	 * @return O vetor de dados rolados
	 */
	public int[] rolar(boolean[] quais) {
		
		int[] faces_resultado = new int[n_dados];
		
		for(int i = 0; i < n_dados; i++) {
			if(quais[i]) {
				d[i].rolar();
			}
		}
		
		for(int i = 0; i < n_dados; i++) {
			faces_resultado[i] = d[i].getLado();
		}
		
		return faces_resultado;
	}
	
	/**
	 * Funcao que rola os dados conforme uma String. Exemplo "1 4 2" é a string que rola somente
	 * os dados 1 4 e 2
	 * @param s A string contendo os dados a rolar
	 * @return O vetor de dados rolados
	 */
	public int[] rolar(java.lang.String s) {
		
		char[] numeros = new char[s.length()];
		int[] faces_resultado = new int[n_dados];
		                         		
		numeros = s.toCharArray();
		
		for(int i = 0; i < s.length(); i++) {
			int aux = ((int) numeros[i]) - 49;
			if(aux >= 0 && aux <= n_dados) {
				d[aux].rolar();
			}
			else
				continue;
		}
		
		for(int i = 0; i < n_dados; i++) {
			faces_resultado[i] = d[i].getLado();
		}
		
		return faces_resultado;
	}
	
	@Override
	/**
	 * Funcao toString() que retorna uma String com o literal desenho das faces dos
	 * dados - resultado da rolagem
	 */
	public String toString() {
		
		String s = "+-----+    ";
		
		for(int i = 0; i < n_dados-1; i++) {
			s += "+-----+    ";
		}
		s += "\n";
		
		for(int i = 0; i < n_dados; i++) {
			switch(d[i].getLado()) {
				case 1:
					s += "|     |    ";
					if(i == n_dados-1) {
						s += "\n";
					}
					break;	
				case 2:
					s += "|*    |    ";
					if(i == n_dados-1) {
						s += "\n";
					}
					break;
				case 3:
					s += "|*    |    ";
					if(i == n_dados-1) {
						s += "\n";
					}
					break;
				case 4:
					s += "|*   *|    ";
					if(i == n_dados-1) {
						s += "\n";
					}
					break;
				case 5:
					s += "|*   *|    ";
					if(i == n_dados-1) {
						s += "\n";
					}
					break;
				case 6:
					s += "|*   *|    ";
					if(i == n_dados-1) {
						s += "\n";
					}
					break;
			}
		}
		
		for(int i = 0; i < n_dados; i++) {
			switch(d[i].getLado()) {
				case 1:
					s += "|  *  |    ";
					if(i == n_dados-1) {
						s += "\n";
					}
					break;	
				case 2:
					s += "|     |    ";
					if(i == n_dados-1) {
						s += "\n";
					}
					break;
				case 3:
					s += "|  *  |    ";
					if(i == n_dados-1) {
						s += "\n";
					}
					break;
				case 4:
					s += "|     |    ";
					if(i == n_dados-1) {
						s += "\n";
					}
					break;
				case 5:
					s += "|  *  |    ";
					if(i == n_dados-1) {
						s += "\n";
					}
					break;
				case 6:
					s += "|*   *|    ";
					if(i == n_dados-1) {
						s += "\n";
					}
					break;
			}
		}
			
		for(int i = 0; i < n_dados; i++) {
			switch(d[i].getLado()) {
				case 1:
					s += "|     |    ";
					if(i == n_dados-1) {
						s += "\n";
					}
					break;	
				case 2:
					s += "|    *|    ";
					if(i == n_dados-1) {
						s += "\n";
					}
					break;
				case 3:
					s += "|    *|    ";
					if(i == n_dados-1) {
						s += "\n";
					}
					break;
				case 4:
					s += "|*   *|    ";
					if(i == n_dados-1) {
						s += "\n";
					}
					break;
				case 5:
					s += "|*   *|    ";
					if(i == n_dados-1) {
						s += "\n";
					}
					break;
				case 6:
					s += "|*   *|    ";
					if(i == n_dados-1) {
						s += "\n";
					}
					break;
			}
		}
		
		for(int i = 0; i < n_dados; i++) {
			s += "+-----+    ";
		}
		
		return s;
		
	}

}
