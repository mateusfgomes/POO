
public class ContaBancaria {

	private String nome = null;
	public int numero_conta = 0;
	private double saldo = 0; 
	
	public ContaBancaria(String c_nome, int c_numero_conta, double c_saldo){
		setSaldo(c_saldo);
		setNome(c_nome);
		this.numero_conta = c_numero_conta;
	}
	


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero_conta() {
		return numero_conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double quantia){
		setSaldo(getSaldo() + quantia);
	}
	
	public void sacar(double quantia){
		if(getSaldo() - quantia >  0){
			setSaldo(getSaldo() - quantia);
		}
	}

}
