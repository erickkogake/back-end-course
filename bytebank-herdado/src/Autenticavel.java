 //Contrato Autenticavel
	//Todos tem que assinar esse contrato, e implementar seus m�todos.
public abstract interface Autenticavel {
	
	public void setSenha(int senha);
	
	public boolean autentica(int senha);

}
