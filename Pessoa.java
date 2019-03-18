
public class Pessoa {

	private String nome = null;
	private int idade = 0;
	private double altura = 0;
	
	public void setNome(String set_nome){
		this.nome = set_nome;
	}
	
	public void setIdade(int set_idade){
		this.idade = set_idade;
	}
	
	public void setAltura(double set_altura){
		this.altura = set_altura;
	}
	
	public double getAltura(){
		return this.altura;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void status(){
		System.out.println(getNome());
		System.out.println(getIdade());
		System.out.println(getAltura());
	}
	
}
