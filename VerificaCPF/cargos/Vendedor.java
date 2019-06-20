package cargos;
/**
 * Classe Vendedor, subclasse de Funcionario
 * @author mateus
 *
 */
public class Vendedor extends Funcionario{
	
	private double comissao;
	
	/**
	 * Construtor do vendedor
	 * @param nome String com o nome do vendedor 
	 * @param cpf String com o CPF do vendedor
	 * @param salarioBase double com o salario base do vendedor
	 * @param comissao double com a porcentagem de comissao do vendedor, exemplo (20% = 0.2)
	 */
	public Vendedor(String nome, String cpf, double salarioBase, double comissao) {
		super(nome, cpf, salarioBase);
		this.setComissao(comissao);
	}
	
	/**
	 * Setter da comissao
	 * @param comissao double com a comissado do vendedor
	 */
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	/**
	 * Getter da comissao
	 * @return double com a comissao do vendedor
	 */
	public double getComissao() {
		return comissao;
	}
	
	/**
	 * Metodo auxiliar que calcula a comissao do vendedor
	 * @return a comissao (em porcentagem) multiplicada pelo salario base
	 */
	private double calculaComissao() {
		return this.getComissao()*this.getSalarioBase();
	}
	
	/**
	 * Metodo que calcula o salaro do vendedor
	 */
	public double calculaSalario() {
		return this.getSalarioBase() + this.calculaComissao();
	}
	

}
