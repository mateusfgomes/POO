import java.util.Calendar;

/**
 * 
 * @author Mateus Ferreira Gomes
 *
 */
public class Random {
	
	private long p = 2147483648L;
	private long m = 843314861;
	private long a = 453816693;
	
	private long xi = 1023;
	
	
	/**
	 * Funcao que escolhe um numero aleatorio a partir do resultado de um calculo (xi = (a + m * xi) % p)
	 * que utiliza uma semente (xi)
	 * @return O numero aleatorio
	 */
	public double getRand(){
		
		xi = (a + m * xi) % p;
		double d = xi;
		return d / p;
	}

	/**
	 * Funcao que realiza o calculo de um numero aleatorio a partir da funcao
	 * getRand() acima listada, porem, agora com um limite maximo para o numero aleatorio
	 * @param max O limite maximo para o numero aleatorio
	 * @return O numero aleatorio
	 */
	public int getIntRand (int max){
		double d = getRand()*max;
		return (int) d;
	
	}
	
	/**
	 * Funcao (Setter) que escolhe uma semente a partir do parametro
	 * @param d A semente
	 */
	public void SetSeed(int d){
		xi = d;
	}
	
	@Override
	/**
	 * Funcao toString() que transforma a semente numa string
	 */
	public String toString(){
		return xi + "";
	}
	
	/**
	 * Funcao utilizada para escolha da semente pelo parametro
	 * @param r Semente a ser utilizada
	 */
	public Random (int r){
		xi = r;
	}
	
	/**
	 * Construtor que cria numeros aleatorios por meio do uso da
	 * Calendar e do .sleep para a geracao de numeros diferentes
	 */
	public Random() {
		try{
		Thread.sleep(1);
		} catch(InterruptedException e){	
		}
		this.xi = Calendar.getInstance().getTimeInMillis()% p ;
	}
	
	/**
	 * Funcao que gera um numero aleatorio dentro de um intervalo estabelecido 
	 * @param min Limitante minimo desse numero aleatorio
	 * @param max Limitante maximo desse numero aleatorio
	 * @return O numero aleatorio dentro dos limites
	 * @throws IllegalArgumentException
	 */
	public int getIntRand(int min, int max) throws IllegalArgumentException{
		if(max <= min){
			throw new IllegalArgumentException("Parametros Invalidos");
		}
		return min + getIntRand(max - min);
	}
	
	/**
	 * Funcao que gera um numero aleatorio com o valor maximo sendo
	 * o maior inteiro possivel
	 * @return O valor aleatorio
	 */
	public int getIntRand(){
		return getIntRand(Integer.MAX_VALUE);
	}
	
	
	

}