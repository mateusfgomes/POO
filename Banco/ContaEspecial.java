
public class ContaEspecial extends ContaBancaria{

	private double limite;
	
	public ContaEspecial(String nome, int conta, double saldo){
		super(nome, conta, saldo);
	}
	
	
	public void sacar(double quantia){
		if(getSaldo() - quantia >= (-limite)){
			setSaldo(getSaldo() - quantia);
		}
	}


	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}

	
	
}
