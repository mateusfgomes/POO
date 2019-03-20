/**
 * Jogo de Bozó desenvolvido para a aula de Programacao Orientada a Objetos 
 * @author Mateus Ferreira Gomes
 *
 */
public class Main {	
	
	public static void main(String[] args) throws java.io.IOException{
		
		String mostra_jogadas, inicia;
		String escolha, placar_agora;
		int pos;
		int pontos;
		int[] resultados = new int[5];
		Placar p = new Placar();
		RolaDados d = new RolaDados(5);
		System.out.println("Bem vindo ao Bozó\n\n");
		
		
		for(int i = 0; i < 10; i++){
			System.out.println("Pressione ENTER para iniciar a rodada\n");
			inicia = EntradaTeclado.leString();
			if(inicia != null) {
				resultados = d.rolar();
				mostra_jogadas = d.toString();
				System.out.println(mostra_jogadas);
				escolha = EntradaTeclado.leString();
				resultados = d.rolar(escolha);
				mostra_jogadas = d.toString();
				System.out.println(mostra_jogadas);
				escolha = EntradaTeclado.leString();
				resultados = d.rolar(escolha);
				mostra_jogadas = d.toString();
				System.out.println(mostra_jogadas);
				System.out.println("\nAdicionar em qual posicao?\n");
				while(true) {
					try {
						pos = EntradaTeclado.leInt();
						break;
						} catch (Exception e) {
							System.out.println("Por favor, digite um numero inteiro");
							
						}
				}	
				p.add(pos, resultados);
				while(!p.pos_legal) {
					System.out.println("\nERRO, posicao ilegal, digite outra posicao\n");
					while(true) {
						try {
							pos = EntradaTeclado.leInt();
							break;
							} catch (Exception e) {
								System.out.println("Por favor, digite um numero inteiro");
							}
					}
					p.add(pos, resultados);
				}
				placar_agora = p.toString();
				System.out.println(placar_agora);
			}
		}
		pontos = p.getScore();
		System.out.println("Pontos: " + pontos);
	}
	
}
