
public class Main {

	public static void main(String[] args) throws Exception{
		
		String s;
		int[] i = new int[5];
		
		RolaDados d = new RolaDados(5);
		
		i = d.rolar("1 2");
		
		s = d.toString();
		
		System.out.println(s);
		
		
		
	}
}
