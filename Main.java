
public class Main {

	
	
	public static void main(String[] args) throws Exception{
		
		String um, dois, tres;
		String escolha, placar_agora;
		int inicia, pos;
		int pontos;
		int[] resultados = new int[5];
		Placar p = new Placar();
		RolaDados d = new RolaDados(5);
		
		System.out.println("Digite 1 para iniciar\n");
		inicia = EntradaTeclado.leInt();
		for(int i = 0; i < 10; i++){
			if(inicia == 1){
				resultados = d.rolar();
				um = d.toString();
				System.out.println(um);
				escolha = EntradaTeclado.leString();
				resultados = d.rolar(escolha);
				dois = d.toString();
				System.out.println(dois);
				escolha = EntradaTeclado.leString();
				resultados = d.rolar(escolha);
				tres = d.toString();
				System.out.println(tres);
			}
			
			System.out.println("Adicionar em qual posicao?\n");
			pos = EntradaTeclado.leInt();
			p.add(pos, resultados);
			placar_agora = p.toString();
			System.out.println(placar_agora);
			
		}
		pontos = p.getScore();
		System.out.println("Pontos: " + pontos);
	}
	
}
