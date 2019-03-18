
public class test {

	public static void main(String[] args) throws Exception{
		
		String s;
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		int aux = 0;
		char aux2;
		
		s = EntradaTeclado.leString();
		
		while(aux < s.length()){
			aux2 = s.charAt(aux);
			if(aux2 == 'a'){
				a++;
			}
			else if(aux2 == 'e'){
				e++;
			}
			else if(aux2 == 'i'){
				i++;
			}
			else if(aux2 == 'o'){
				o++;
			}
			else if(aux2 == 'u'){
				u++;
			}
			aux++;
		}
			
		
		System.out.println("A:" + a);
		System.out.println("E:" + e);
		System.out.println("I:" + i);
		System.out.println("O:" + o);
		System.out.println("U:" + u);
	}
	
}
