public class Dado {
	
	private int lado;
	private int face;
	Random r = new Random();
	
	public Dado(int n){
		this.lado = n;
	}
	
	public Dado(){
		this.lado = 6;
	}

	public int getLado() {
		return face;
	}
	
	public int rolar() {
		face =	r.getIntRand(6) + 1;
		return face;
	}
	
	@Override
	public String toString(){
		
		String s;
		
		switch(getLado()) {
			case 1:
				return "+-----+\n|     |\n|  *  |\n|     |\n+-----+";
				
			case 2:
				return "+-----+\n|*    |\n|     |\n|    *|\n+-----+";
			case 3:
				return "+-----+\n|*    |\n|  *  |\n|    *|\n+-----+";
			case 4:
				return "+-----+\n|*   *|\n|     |\n|*   *|\n+-----+";
			case 5:
				return "+-----+\n|*   *|\n|  *  |\n|*   *|\n+-----+";
			case 6:
				return "+-----+\n|*   *|\n|*   *|\n|*   *|\n+-----+";	
		}
		return null;
	}
	
}

		