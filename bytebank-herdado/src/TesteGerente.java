
public class TesteGerente {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Joffrey");
		g1.setCpf("3444314944");
		g1.setSalario(6000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(2323);
		boolean autenticou = g1.autentica(1212);
		System.out.println(autenticou);
		System.out.println(g1.autentica(2323));
		
		System.out.println(g1.getBonificacao());
		
		
		
	}
}
