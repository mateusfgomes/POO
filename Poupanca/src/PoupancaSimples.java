/**
 * Subclasse poupanca simples, que extende ContaPoupanca
 * @author mateus
 *
 */
public class PoupancaSimples extends ContaPoupanca{
	
	
	/**
	 * Construtor da poupanca simples
	 * @param n o nome do correntista
	 * @param dia o dia do vencimento
	 */
	public PoupancaSimples(String n, int dia) {
		super(n, dia);
	}
	
	/**
	 * Metodo que atualiza o saldo da poupanca simples (com rendimento menor)
	 */
	@Override
	public void atualiza(double taxa) {
		
		double s = getSaldo();
		setSaldo(s * (1.0 + taxa));
		
	}
	
}
