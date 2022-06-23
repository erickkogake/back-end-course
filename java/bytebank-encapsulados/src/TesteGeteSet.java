
public class TesteGeteSet {
	public static void main(String[] args) {
		Conta contaDoErick = new Conta(1333 , 6060);
		Cliente erick = new Cliente();
		contaDoErick.setTitular(erick);
		
		Conta conta2 = new Conta(6432,6464);
		Conta conta3 = new Conta(6060,3232);
		contaDoErick.deposita(4000);
		contaDoErick.saca(1000);
		contaDoErick.setNumero(1377);
		
		System.out.println(contaDoErick.getSaldo());
		System.out.println(contaDoErick.getNumero());
		
		contaDoErick.setAgencia(12);
		System.out.println(contaDoErick.getAgencia());
		
		contaDoErick.getTitular().setProfissao("Marceneiro");
		System.out.println(contaDoErick.getTitular().getProfissao());
		
		System.out.println(Conta.getTotal());
		
	}

}
	