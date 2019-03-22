
public class SorteiaCartas {
	
	Carta[] c;
	
	public SorteiaCartas() {
		c = new Carta[5];
		for(int i = 0; i < 5; i++) {
			c[i] = new Carta();
		}
	}
	
	public int[][] sorteia(String s) {
		
		int[][] faces_resultado = new int[5][2];
		
		for(int i = 0; i < s.length(); i++) {
			int posicao = s.charAt(i) -'0';
			if(posicao > 0 && posicao < 6) {
				Carta teste = new Carta();
				teste.aleatorizarCarta();
				for(int j = 0; j < 5; j++) {
					while(teste == c[j]) {
						teste.aleatorizarCarta();
					}
				}
				c[posicao-1] = teste;
				
			}
		}
		
		for(int j = 0; j < 5; j++) {
			faces_resultado[j] = c[j].getFace();
		}
		
		return faces_resultado;
		 
	}
	

	
	public String toString() {
		
		String s = "";
		String copas = Character.valueOf((char) 9826) + "";
		String paus = Character.valueOf((char) 9827) + "";
		String espadas = Character.valueOf((char) 9828) + "";
		String ouros = Character.valueOf((char) 9829) + "";
		String topo_base = "+------+    ";
		String lateral = "|      |    ";
		String meio1 = "|  ";
		String meio2 = "  |    ";
		String meio3 = " |    ";
		
		
		for(int i = 0; i < 5; i++) {
			s += topo_base;
		}
		s += "\n";
		
		for(int i = 0; i < 5; i++) {
			s += lateral;
		}
		s += "\n";
		
		
		
		for(int i = 0; i < 5; i++) {
			s += meio1;
			
			if(c[i].getFace()[1] <= 10) s += c[i].getFace()[1];
			else {
				switch(c[i].getFace()[1]) {
					case 11:
						s += 'J';
						break;
					case 12:
						s += 'Q';
						break;
					case 13:
						s += 'K';
						break;
					case 1:
						s += 'A';
						break;
				}
			}
			
			
			switch(c[i].getFace()[0]) {
				case 0:
					s += copas;
					break;
				case 1:
					s += paus;
					break;
				case 2:
					s += espadas;
					break;
				case 3:
					s += ouros;
					break;
			}
			if(c[i].getFace()[1] == 10) s += meio3;
			else s += meio2;
		}
		s += "\n";
		
		for(int i = 0; i < 5; i++) {
			s += lateral;
		}
		s += "\n";
		
		for(int i = 0; i < 5; i++) {
			s += topo_base;
		}
		
		return s;
		
	}
	
}
