// n�o pode instanciar objetos dessa classe, pois � abstrata.
public abstract class Funcionario2 {
	
	private String nome;
	private String cpf;
	private double salario;
	//protected double salario;
	
//n�o tem uma implementa��o, s� a classe filha que vai precisar ter.
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario( ) {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}	
