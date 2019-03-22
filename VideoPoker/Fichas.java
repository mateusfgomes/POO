
public class Fichas {

	private int saldoFichas;
	private int aposta;
	
	/**
	 * Construtor iniciliza saldo fichas com 200(Padrao).
	 */
	public Fichas(){
		this.saldoFichas = 200;
		this.aposta = 0;
	}
	
	/**
	 * Construtor inicializa saldo fichas como n.
	 * @param n : numero fichas.
	 */
	public Fichas(int n){
		this.saldoFichas = n;
		this.aposta = 0;
	}
	
	
	/**
	 * Funcao adiciona mais fichas ao seu saldo.
	 * @param n : numero fichas p adicionar.
	 */
	public void addFichas(int n){
		this.saldoFichas = this.saldoFichas + n;
	}
	
	/**
	 * Retorna saldo de fichas.
	 * @return Saldo fichas.
	 */
	public int getSaldo(){
		return this.saldoFichas;
	}
	
	
	
	public String verificaCombinacoes(int[][] cartas){
		
		int vetCartas[] = new int[14];           //Armazenar as cartas que possui em maos.
		int naipes[] = new int[4];			//Armazenar quantidade de cada naipe
		String retornaJogada = "";

		for(int i = 0; i<14; i++){			//Zerando o array. 1 = AS, 2 = 2, 3 = 3...... 10 = 10, 11 = valete , 12 = dama , 13 = rei
			vetCartas[i] = 0;
		}

		for(int i = 0; i<4; i++){            //Zerando array de naipes.
			naipes[i] = 0;
		}
		
		
		for(int i = 0; i < 5; i++){		 	//Guardando no vetor vetCartas as 5 cartas da mao atual.
			int j = 0;
			j = cartas[i][1];
			vetCartas[j]++;
		}
		
		for(int i = 0; i<5; i++){			//Guardando naipes das cartas atuais no vetor naipes.
			int j = 0;
			j = cartas[i][0];
			naipes[j]++;
		}


		int flagSequencia = 0;              //Caso mantenha == 0, nao tem sequencia. Caso == 1, existe sequencia.
		int sequenciaAlta = 0;				 //Maior sequencia ("ACE HIGH"), T - J - Q - K -A	

		if(vetCartas[10] == 1 && vetCartas[11] == 1 && vetCartas[12] == 1 && vetCartas[13] == 1 && vetCartas[1] == 1){        //Procura pela maior sequencia.
				sequenciaAlta = 1;
		}
		else{
			for(int i = 1; i < 10; i++){																						//Procura por sequencia.
				if(vetCartas[i] == 1 && vetCartas[i+1] ==1 && vetCartas[i+2] == 1 && vetCartas[i+3] == 1 && vetCartas[i+4] == 1 ){			
					flagSequencia = 1;
					break;
				}
			}
		}

		int flagFlush = 0;

		if(naipes[0] == 5 || naipes[1] == 5 || naipes[2] == 5 || naipes[3] == 5){
			flagFlush = 1;
		}

		



		if(sequenciaAlta == 1 && flagFlush == 1){
			retornaJogada += "PARABENS ROYAL STRAIGHT FLUSH";
			return retornaJogada;
		}
		else if(flagSequencia == 1 && flagFlush ==1){
			retornaJogada += "PARABENS STRAIGHT FLUSH";
			return retornaJogada;
		}
		else if(flagFlush == 1){
			retornaJogada += "PARABENS FLUSH";
			return retornaJogada;
		}	
		else if(flagSequencia == 1 || sequenciaAlta == 1){
			retornaJogada += "PARABENS SEQUENCIA";
			return retornaJogada;
		}
		else{                   //Caso entre aqui, jogador nao possui: Royal/Straight flush/flusg/straight.

			int flagQuadra = 0;

			for(int i = 1; i <14 ; i++){
				if(vetCartas[i] == 4){
					flagQuadra = 1;
					break;
				}
			}

			if(flagQuadra == 1){
				retornaJogada += "PARABENS QUADRA";
				return retornaJogada;
			}
			else{
				int flagTrinca = 0;
				int flagPar = 0;


				for(int i = 1; i < 14; i++){
					if(vetCartas[i] == 2){
						flagPar++;
					}
					else if(vetCartas[i] == 3){
						flagTrinca = 1;
					}
				}

				if(flagTrinca == 1 && flagPar == 1){
					retornaJogada += "PARABENS FULL HOUSE";
					return retornaJogada;
				}
				else if(flagTrinca == 1){
					retornaJogada += "PARABENS TRINCA";
					return retornaJogada;
				}
				else if(flagPar == 2){
					retornaJogada += "PARABENS TWO PAIR";
					return retornaJogada;
				}
				else{
					retornaJogada += "PERDEU DISGRACA";
					return retornaJogada;
				}



			}

			


		}							


		
		
	}
	
}