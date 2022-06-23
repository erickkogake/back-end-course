
public class TesteFuncionarios {
	
	public static void main(String[] args) {
		Gerente gabriel = new Gerente();
		gabriel.setSalario(7000.0);
		
		EditorVideo soares = new EditorVideo();
		soares.setSalario(3000);
		
		Designer Maria = new Designer();
		Maria.setSalario(1500);
		
		ControleBoni2 funcionario = new ControleBoni2();
		funcionario.registra2(Maria);
		funcionario.registra2(soares);
		funcionario.registra2(gabriel);
		
		System.out.println(funcionario.getSoma());
	}

}
