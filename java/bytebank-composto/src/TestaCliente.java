
public class TestaCliente {
	public static void main(String[] args) {
		Cliente erick = new Cliente();
		erick.nome = "Erick Kogake";
		erick.cpf = "432.777.988-16";
		erick.profissao = "Programador, se Deus quiser";
		
		Conta contaDoErick = new Conta();
		contaDoErick.deposita(300);
		
		contaDoErick.titular = erick; // Estamos fazendo a composição da conta (contaDoErick) do atributo titular, com o objeto Cliente, no caso erick.
		
		contaDoErick.endereco = new Endereco();
		contaDoErick.endereco.logradouro = "Rua";
		contaDoErick.endereco.numero = 444;
		contaDoErick.endereco.bairro = "Vila";
				
				
		System.out.println(contaDoErick.getSaldo());
		System.out.println(contaDoErick.titular.nome);
		System.out.println(contaDoErick.titular.cpf);
		System.out.println(contaDoErick.titular.profissao);
		System.out.println(contaDoErick.endereco.logradouro);
		System.out.println(contaDoErick.endereco.numero);
		
	}

}
