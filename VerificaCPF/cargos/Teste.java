package cargos;
import leitura.EntradaTeclado;

/**
 * Main com os testes requisitados
 * Se desejar adicionar menos funcionarios, editar os for's e o tamanho do vetor
 * @author Mateus Ferreira Gomes
 *
 */
public class Teste {

	public static void main(String[] args) throws Exception {
		
		Funcionario[] f = new Funcionario[10];
		String nome;
		String cpf;
		double salario_base;
		double comissao = 0;
		int escolha;
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Digite o tipo de funcionario a ser criado. '1' para Gerente, '2' para Assistente, '3' para vendedor \n");
			while(true) {
				escolha = EntradaTeclado.leInt();
				if (escolha >= 1 && escolha <= 3)
					break;
				else
					System.out.println("Digite apenas 1, 2 ou 3");
			}
			System.out.println("Digite o nome: \n");
			nome = EntradaTeclado.leString();

			System.out.println("Digite o CPF: \n");
			cpf  = EntradaTeclado.leString();
			while(!Funcionario.verificaCPF(cpf)) {
				System.out.println("CPF INVALIDO, DIGITE O CPF CONFORME O MODELO XXX.XXX.XXX-XX \n");
				cpf  = EntradaTeclado.leString();
			}	
			
			System.out.println("Digite o Salario Base: \n");
			salario_base  = EntradaTeclado.leDouble();
			
			if (escolha == 3) {
				System.out.println("Digite a comissao em porcentagem: \n");
				comissao = EntradaTeclado.leDouble();
				
			}	
			
			if(escolha == 1) {
				Gerente g = new Gerente(nome, cpf, salario_base);
				f[i] = g;
			}
			else if(escolha == 2) {
				Assistente a = new Assistente(nome, cpf, salario_base);
				f[i] = a;
			}
			else{
				Vendedor v = new Vendedor(nome, cpf, salario_base, comissao);
				f[i] = v;
			}
		}		
		
		
		for(int i = 0; i < 10; i++) {
			double salario = f[i].calculaSalario();
			System.out.println("=============================\n");
			System.out.println("FOLHA DE PAGAMENTO\n");
			System.out.println("Nome: " + f[i].getNome());
			System.out.println("CPF: " + f[i].getCPF());
			System.out.println("Salario: " + salario);
			System.out.println("\n=============================\n");
		}
		
		
	}
	
}
