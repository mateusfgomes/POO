import java.util.Calendar;

public class Random {
	
	private long p = 2147483648L;
	private long m = 843314861;
	private long a = 453816693;
	
	private long xi = 1023;
	
	
	
	public double getRand(){
		
		xi = (a + m * xi) % p;
		double d = xi;
		return d / p;
	}

	
	public int getIntRand (int max){
		double d = getRand()*max;
		return (int) d;
	
	}
	
	public void SetSeed(int d){
		xi = d;
	}
	
	@Override
	public String toString(){
		return xi + "";
	}
	
	
	public Random (int r){
		xi = r;
	}
	
	public Random() {
		try{
		Thread.sleep(1);
		} catch(InterruptedException e){	
		}
		this.xi = Calendar.getInstance().getTimeInMillis()% p ;
	}
	
	public int getIntRand(int min, int max) throws IllegalArgumentException{
		if(max <= min){
			throw new IllegalArgumentException("Parametros Invalidos");
		}
		return min + getIntRand(max - min);
	}
	
	public int getIntRand(){
		return getIntRand(Integer.MAX_VALUE);
	}
	
	
	

}