package cargos;
/**
 * Classe Gerente, subclasse de Funcionario
 * @author mateus
 *
 */
public class Gerente extends Funcionario{
	
	/**
	 * Construtor do Gerente
	 * @param nome String com o nome do Gerente
	 * @param cpf String com o CPF do Gerente
	 * @param salarioBase double com o salario base do gerente
	 */
	public Gerente(String nome, String cpf, double salarioBase) {
		super(nome, cpf, salarioBase);
	}
	
	/**
	 * Metodo que calcula o salario do gerente
	 * a partir de 2 vezes o salario base
	 */
	public double calculaSalario() {
		
		double salario;
		
		salario = this.getSalarioBase()*2;
		
		return salario;
		
	}
	
}
