
public class Dado {

		private int lados;
	
		public Dado(int n){
			setLados(n);
		}
		
		public Dado(){
			setLados(6);
		}

		public int getLados() {
			return lados;
		}

		public void setLados(int lados) {
			this.lados = lados;
		}
}
