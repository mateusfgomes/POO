/**
 * Subclasse de conta poupanca, Poupanca ouro, que rende mais
 * @author Mateus Ferreira Gomes
 *
 */
public class PoupancaOuro extends ContaPoupanca{
	
	/**
	 * Construtor da poupanca ouro
	 * @param n o nome do correntista
	 * @param dia dia do vencimento
	 */
	public PoupancaOuro(String n, int dia) {
		super(n, dia);
	}
	
	/**
	 * Metodo para atualizar o saldo da poupanca ouro (com rendimento maior)
	 */
	@Override
	public void atualiza(double taxa) {
		
		double s = getSaldo();
		setSaldo(s * (1.0 + 1.5 * taxa));
		
	}
	
}
