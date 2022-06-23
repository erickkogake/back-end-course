
public class TestaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		Conta segundaConta = primeiraConta;
		
		primeiraConta.saldo = 663;
		segundaConta.saldo += 100;
		
		System.out.println("O saldo da conta de André é : " + segundaConta.saldo);
		System.out.println("O saldo da conta de Erick é : " + primeiraConta.saldo);
		
		Conta segundaConta2 = new Conta();
		segundaConta2.agencia = 1966;
		segundaConta2.saldo = 689;
		segundaConta2.numero = 6060;
		
		System.out.println(segundaConta2.agencia + " " + segundaConta2.numero + " " + segundaConta2.saldo);
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		System.out.println(segundaConta2);
		
	}

}
