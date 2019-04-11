package cargos;
/**
 * Classe abstrata funcionario que contem o metodo abstrato requisitado
 * e os atrubutos de um funcionario
 * 
 * @author Mateus Ferreira Gomes
 *
 */
public abstract class Funcionario {

	
	private String nome;
	private String CPF;
	private double salarioBase;
	
	/**
	 * Construtor do Funcionario
	 * @param nome Nome do funcionario 
	 * @param cpf CPF do Funcionario 
	 * @param salariobase Salario Base para o funcionario
	 */
	public Funcionario(String nome, String cpf, double salariobase) {
		this.setCPF(cpf);
		this.setNome(nome);
		this.setSalarioBase(salariobase);
	}
	
	/**
	 * Getter do nome do funcionario
	 * @return String com o nome
	 */
	public String getNome() {
		return nome;
	}


	/**
	 * Setter do nome de um funcionario
	 * @param nome String do nome a ser setado
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}


	/**
	 * Getter do CPF 
	 * @return String com o CPF do funcionario
	 */
	public String getCPF() {
		return CPF;
	}


	/**
	 * Setter do CPF
	 * @param cpf String do CPF a ser setado
	 */
	public void setCPF(String cpf) {
		this.CPF = cpf;
	}


	/**
	 * Getter do Salario Base do funcionario
	 * @return double com o Salario Base
	 */
	public double getSalarioBase() {
		return salarioBase;
	}


	/**
	 * Setter do salario base
	 * @param salarioBase double com o salario base a ser setado
	 */
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	/**
	 * Metodo que verifica o CPF conforme o modelo XXX.XXX.XXX-XX
	 * @param CPF String com o CPF a ser verificado
	 * @return true se seguir o modelo, false se nao seguir o modelo
	 */
	public static boolean verificaCPF(String CPF) {
		
		
		if(CPF.length() != 14)
			return false;
		
		else if(CPF.charAt(3) != '.' ||	CPF.charAt(7) != '.' || CPF.charAt(11) != '-')
			return false;
		
		for(int i = 0; i < 14; i++) {
			if (i == 3 || i == 7 || i == 11)
				continue;
			else if(CPF.charAt(i) < 48 || CPF.charAt(i) > 57)
				return false;
		}
		
		return true;
		
	}
	
	/**
	 * Metodo abstrado de calculaSalario;
	 * @return double com o salario
	 */
	public abstract double calculaSalario(); 
	
}
