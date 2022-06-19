
public class TesteReferencias {
	public static void main(String[] args) {
		//Gerente g1 = new Gerente();
		
//		g1.setNome("Marcelo");
//		String nome = g1.getNome();
//		g1.setSenha(1010);
//		boolean senha =  g1.autentica(1010);
//		
//		System.out.println(nome);
//		System.out.println(senha);
//		
		//exemplo aplicando o polimorfismo a seguir.
	
		Funcionario2 g2 = new Gerente();
		
		g2.setCpf("9874651234");
		g2.setNome("Marcos Paulo");
		
		System.out.println(g2.getNome() + g2.getCpf());
	}
}
