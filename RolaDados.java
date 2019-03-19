
public class RolaDados {
	
	private int n_dados;
	Dado[] d = null; 
	
	public RolaDados(int n) {
		n_dados = n;
		d = new Dado[n];
	}
	
	public int[] rolar() {
		
		int[] faces_resultado = new int[n_dados];
		
		for(int i = 0; i < n_dados; i++) {
			faces_resultado[i] = d[i].rolar();
		}
		
		return faces_resultado;
		
	}
	
	public int[] rolar(boolean[] quais) {
		
		int[] faces_resultado = new int[n_dados];
		
		for(int i = 0; i < n_dados; i++) {
			if(quais[i]) {
				faces_resultado[i] = d[i].rolar();
			}
		}
		
		return faces_resultado;
	}
	
	public int[] rolar(String s) {
		
		char[] numeros = new char[s.length()];
		int[] faces_resultado = new int[n_dados];
		                          
		numeros = s.toCharArray();		
		
		for(int i = 0; i < s.length(); i++) {
			int aux = ((int) numeros[i]) - 49;
			if((aux >= 49 && aux <= 57) && aux <= n_dados) {
				faces_resultado[i] = d[aux].rolar();
			}
			else
				continue;
		}
		
		System.out.println(faces_resultado[1] + "\n");
		
		return faces_resultado;
	}
	
	@Override
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
