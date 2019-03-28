import java.util.Arrays;

/**
 * Classe Sorteia Cartas, que tem a funcao de sortear as cartas usadas para jogar e marcar
 * as cartas a fim de nao repeti-las
 * @author Mateus Ferreira Gomes e Guilherme Targon Marques Barcellos
 *
 */
public class SorteiaCartas {
	
	Carta[] c;
	public String a;
	boolean[] cartas_usadas = new boolean[53];
	
	
	/**
	 * Construtor para criar um vetor de cartas a fim de jogar com elas
	 */
	public SorteiaCartas() {
		c = new Carta[5];
		for(int i = 0; i < 5; i++) {
			c[i] = new Carta();
		}
	}
	
	/**
	 * Metodo que realiza o sorteio das cartas sempre a partir de uma string
	 * @param s string que indica quais cartas serao trocadas
	 * @return vetor de inteiros de cartas resultado da troca
	 */
	public int[][] sorteia(String s) {
			
			int[][] faces_resultado = new int[5][2];
			
			for(int i = 0; i < s.length(); i++) {
				int posicao = s.charAt(i) -'0';
				if(posicao > 0 && posicao < 6) {
					Carta teste = new Carta();
					teste.aleatorizarCarta();
					int pos_bool = (teste.getFace()[0])*13 + teste.getFace()[1];
						while(cartas_usadas[pos_bool]) {
							teste.aleatorizarCarta();
							pos_bool = (teste.getFace()[0])*13 + teste.getFace()[1];
						}
					cartas_usadas[pos_bool] = true;
					c[posicao-1] = teste;	
				}
			}
			
			for(int j = 0; j < 5; j++) {
				faces_resultado[j] = c[j].getFace();
			}
			
			return faces_resultado;
			 
	}
	

	/**
	 * Metodo toString(), o qual tem a funcao de mostrar literalmente as cartas
	 */
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
	
	/**
	 * Metodo que reseta o vetor que marca as cartas usadas
	 */
	public void resetaUsadas() {
		Arrays.fill(cartas_usadas, false);
	}
	
}
