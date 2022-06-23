
public class TestaEndereco {
	public static void main(String[] args) {
		Endereco erick = new Endereco();
		erick.logradouro = "Rua";
		erick.numero = 333;
		erick.bairro = "Vila";
		erick.complemento = "na vila";
		
		Conta contaDoErick = new Conta();
		contaDoErick.endereco = erick;
		
		System.out.println(contaDoErick.endereco.logradouro);
		System.out.println(contaDoErick.endereco.numero);
		System.out.println(contaDoErick.endereco.bairro);
		System.out.println(contaDoErick.endereco.complemento);
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.endereco.logradouro = "Rua fernandez";
		
		System.out.println(contaDoPaulo.endereco.logradouro);
	}
}
