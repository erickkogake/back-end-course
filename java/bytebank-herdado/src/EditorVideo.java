
public class EditorVideo extends Funcionario2 implements Autenticavel {
	
	private int senha;
	
	public double getBonificacao() {
		double boni = super.getSalario() + 200;
		return boni;
	}
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
			}
	
}	

