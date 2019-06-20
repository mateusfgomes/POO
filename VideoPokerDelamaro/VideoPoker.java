/**
 * Jogo de VideoPoker desenvolvido para a aula de Programacao Orientada a Objetos 
 * @author Mateus Ferreira Gomes e Guilherme Targon Marques Barcellos
 *
 */
public class VideoPoker {	
	
	public static void main(String[] args) throws java.io.IOException{
		
		String mostra_jogadas, inicia;
		String escolha; 
		String ans;
		int aposta;
		int[][] resultado = new int[5][2];
		SorteiaCartas c = new SorteiaCartas();
		Dealer f = new Dealer();
		
		System.out.println("Bem vindo ao VideoPoker\n\n");
		
		
		while(f.getSaldo() > 0){
			System.out.println("Pressione ENTER para iniciar a rodada ou 'E' para finalizar\n");
			
			inicia = EntradaTeclado.leString();
			if(inicia.contentEquals("e") || inicia.contentEquals("E")){
				System.out.println("Finalizando VideoPoker...\n");
				System.out.println("Seu saldo final fichas: "+f.getSaldo()+"\n");
				System.out.println("VideoPoker finalizado. Obrigado por jogar!\n");
				return;
			}
			System.out.println("Digite valor da aposta\n");
			
			while(true){
				try{
					aposta = EntradaTeclado.leInt();
					while(aposta <0 || aposta > f.getSaldo()){
						System.out.println("Valor da aposta nao eh valido, digite valor maior que zero e menor que seu saldo fichas\n");
						aposta = EntradaTeclado.leInt();
					}
					break;
				}
				catch (Exception e){
					System.out.println("Valor da aposta nao eh valido, digite um numero inteiro\n");
					continue;
				}
				
			}
			
			f.setAposta(aposta);
			if(inicia != null ) {
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
				ans = f.verificaCombinacoes(resultado);
				System.out.println(ans);
				System.out.println("Saldo atual: "+f.getSaldo());
				c.resetaUsadas();
			}
			
		}
		System.out.println("Fim de jogo!!!!");
	}
	
}