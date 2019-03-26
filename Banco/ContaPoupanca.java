
public class ContaPoupanca extends ContaBancaria{
	
	private int dia = 0;
	
	public ContaPoupanca(String nome, int conta, double saldo){
		super(nome, conta, saldo);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public void atualiza(double taxa){
		setSaldo(getSaldo()*(1+taxa));
	}
	
	
	
}
