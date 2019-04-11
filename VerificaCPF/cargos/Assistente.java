package cargos;
/**
 * Classe Assistente, subclasse de Funcionario
 * @author mateus
 *
 */
public class Assistente extends Funcionario{
	
	/**
	 * Construtor do Assistente
	 * @param nome String com o nome do Assistente
	 * @param cpf String com o CPF do Assistente
	 * @param salarioBase double com o salario base do Assistente
	 */
	public Assistente(String nome, String cpf, double salarioBase) {
		super(nome, cpf, salarioBase);
	}
	
	/**
	 * Metodo que calcula o salario do Assistente (1*salario base)
	 */
	public double calculaSalario() {
		
		return this.getSalarioBase();
		
	}
	
}
