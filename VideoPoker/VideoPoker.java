
/**
 * Jogo de VideoPoker desenvolvido para a aula de Programacao Orientada a Objetos 
 * @author Mateus Ferreira Gomes
 *
 */
public class VideoPoker {	
	
	public static void main(String[] args) throws java.io.IOException{
		
		String mostra_jogadas, inicia;
		String escolha, placar_agora;
		String ans;
		int pos;
		int pontos;
		int aposta;
		int[][] resultado = new int[5][2];
		SorteiaCartas c = new SorteiaCartas();
		Fichas f = new Fichas();
		
		System.out.println("Bem vindo ao VideoPoker\n\n");
		
		
		while(f.getSaldo() > 0){
			System.out.println("Pressione ENTER para iniciar a rodada\n");
			
			inicia = EntradaTeclado.leString();
			System.out.println("Aposta\n");
			aposta = EntradaTeclado.leInt();
			f.setAposta(aposta);
			if(inicia != null && aposta > 0 && aposta <= f.getSaldo()) {
				resultado = c.sorteia("1 2 3 4 5");
				mostra_jogadas = c.toString();
				System.out.println(mostra_jogadas);
				escolha = EntradaTeclado.leString();
				resultado = c.sorteia(escolha);
				mostra_jogadas = c.toString();
				System.out.println(mostra_jogadas);
				escolha = EntradaTeclado.leString();
				resultado = c.sorteia(escolha);
				mostra_jogadas = c.toString();
				System.out.println(mostra_jogadas);
				/*resultado[0][0] = 0;
				resultado[1][0] = 1;
				resultado[2][0] = 2;
				resultado[3][0] = 3;
				resultado[4][0] = 0;
				
				resultado[0][1] = 10;
				resultado[1][1] = 10;
				resultado[2][1] = 2;
				resultado[3][1] = 2;
				resultado[4][1] = 1;
				*/
				ans = f.verificaCombinacoes(resultado);
				System.out.println(ans);
				System.out.println(f.getSaldo());
			}
			
		}
		
	}
	
}
