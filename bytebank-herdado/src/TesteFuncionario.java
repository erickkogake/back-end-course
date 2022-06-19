
public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario nicco = new Funcionario();
		nicco.setNome("Nicco Pagget");
		nicco.setCpf("434.464.888-XX");
		nicco.setSalario(3000);
		
		System.out.println(nicco.getNome());
		System.out.println(nicco.getCpf());
		System.out.println(nicco.getSalario());
		
		
	}
}
