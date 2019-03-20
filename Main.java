
public class Main {

	
	
	public static void main(String[] args) throws Exception{
		
		String mostra_jogadas, inicia;
		String escolha, placar_agora;
		int pos;
		int pontos;
		int[] resultados = new int[5];
		Placar p = new Placar();
		RolaDados d = new RolaDados(5);
		
		
		for(int i = 0; i < 10; i++){
			System.out.println("Pressione ENTER para iniciar a rodada\n");
			inicia = EntradaTeclado.leString();
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
			pos = EntradaTeclado.leInt();
			p.add(pos, resultados);
			while(p.pos_ocupada) {
				System.out.println("\nERRO, posicao ja ocupada, digite uma posicao desocupada\n");
				pos = EntradaTeclado.leInt();
				p.add(pos, resultados);
			}
			placar_agora = p.toString();
			System.out.println(placar_agora);
			
		}
		pontos = p.getScore();
		System.out.println("Pontos: " + pontos);
	}
	
}
