import java.util.Arrays;

/**
 * 
 * @author Mateus Ferreira Gomes
 *
 */
public class Placar {

	private int[] pontuacao = new int[10]; //Vetor que armazena as pontuacoes que estarao no placar
	public boolean pos_legal = true; //Variavel booleana que faz o controle se a posicao a inserir o resultado é legal ou nao
	
	/**
	 * Construtor que preeenche o placar inteiro com o numero -1
	 * a fim de realizar o controle se aquele espaco ja foi utilizado alguma vez
	 */
	public Placar(){
		Arrays.fill(pontuacao, -1);
	}
	
	/**
	 * Funcao que adiciona o resultado de uma jogada no placar para realizar a contagem dos pontos
	 * @param posicao Posicao do placar que a pontuacao sera adicionada
	 * @param dados	O vetor resultado da rolagem dos dados
	 * @throws java.lang.IllegalArgumentException
	 */
	public void add(int posicao, int[] dados) throws java.lang.IllegalArgumentException{
		
		if(posicao < 0 || posicao > 10 || pontuacao[posicao-1] != -1) {
			pos_legal = false;
			return;
		}
		pos_legal = true;
		
		int contador = 0;
		int[] aux = new int[7];
		
		for(int i = 0; i < dados.length; i++){
			aux[dados[i]]++;
		}
		
		if(posicao <= 6 && posicao >= 1){
			
			for(int i = 0; i < dados.length; i++){
				if(posicao == dados[i]){
					contador++;
				}	
			}
			
			pontuacao[posicao-1] = posicao*contador;
		}
		else{
			switch(posicao){
				case 7:
					boolean flag_dupla = false;
					boolean flag_trinca = false;
					
					for(int i = 1; i < 7; i++){
						if(aux[i] == 2) flag_dupla = true;
						else if(aux[i] == 3) flag_trinca = true;
					}
					
					if(flag_dupla && flag_trinca)
						pontuacao[6] = 15;
					else
						pontuacao[6] = 0;
					break;
				case 8:
					boolean flag_sequencia_1_5 = true;
					boolean flag_sequencia_2_6 = true;
					
					for(int i = 1; i < 6; i++){
						if(aux[i] != 1) { 
							flag_sequencia_1_5 = false;
							break;
						}
					}
					
					for(int i = 2; i < 7; i++){
						if(aux[i] != 1) { 
							flag_sequencia_2_6 = false;
							break;
						}
					}
					
					if(flag_sequencia_1_5 || flag_sequencia_2_6)
						pontuacao[7] = 20;
					else
						pontuacao[7] = 0;
					break;
				case 9:
					boolean flag_quadra = false;
					
					for(int i = 1; i < 7; i++){
						if(aux[i] == 4) flag_quadra = true;
					}
					
					if(flag_quadra)
						pontuacao[8] = 30;
					else
						pontuacao[8] = 0;
					break;
				case 10:
					boolean flag_quina = false;
					
					for(int i = 1; i < 7; i++){
						if(aux[i] == 5) flag_quina = true;
					}
					
					if(flag_quina)
						pontuacao[9] = 40;
					else
						pontuacao[9] = 0;
					break;
			}
		}
	}
	
	/**
	 * Funcao que realiza a soma da pontuacao obtida pelo jogador
	 * @return A pontuacao obtida
	 */
	public int getScore(){
		
		int soma = 0;
		
		for(int i = 0; i < pontuacao.length; i++){
			if(pontuacao[i] != -1)
				soma += pontuacao[i];
		}
		
		return soma;
	}
	
	
	@Override
	/**
	 * Funcao toString() que printa, literalmente, o placar atual obtido pelo jogador, ou seja,
	 * onde ele colocou os pontos
	 */
	public java.lang.String toString(){
		
		String ans = " ";
		String um = "(1)";
		String dois = "(2)";
		String tres = "(3)";
		String quatro = "(4)";
		String cinco = "(5)";
		String seis = "(6)";
		String sete = "(7)";
		String oito = "(8)";
		String nove = "(9)";
		String dez = "(10)";
		String sep = "    |   ";
		String linha = " --------------------------\n ";
		
		if(pontuacao[0] == -1) ans += um;
		else ans += pontuacao[0];  
		ans += sep;
		
		if(pontuacao[6] == -1) ans += sete;
		else ans += pontuacao[6];
		ans += sep;
		
		if(pontuacao[3] == -1) ans += quatro;
		else ans += pontuacao[3];
		ans += " \n";
		ans += linha;
		
		if(pontuacao[1] == -1) ans += dois;
		else ans += pontuacao[1];  
		ans += sep;
		
		if(pontuacao[7] == -1) ans += oito;
		else ans += pontuacao[7];
		ans += sep;
		
		if(pontuacao[4] == -1) ans += cinco;
		else ans += pontuacao[4];
		ans += " \n";
		ans += linha;
		
		if(pontuacao[2] == -1) ans += tres;
		else ans += pontuacao[2];  
		ans += sep;
		
		if(pontuacao[8] == -1) ans += nove;
		else ans += pontuacao[8];
		ans += sep;
		
		if(pontuacao[5] == -1) ans += seis;
		else ans += pontuacao[5];
		ans += " \n";
		ans += linha;
		
		ans += "       |   ";
		if(pontuacao[9] == -1) ans += dez;
		else ans += pontuacao[9];
		ans += "   |";
		ans += "\n";
		ans += "        +----------+ ";
		
		return ans;
	}
}
