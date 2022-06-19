public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 693.55;
		primeiraConta.agencia = 1977;
		primeiraConta.numero = 6463;
		primeiraConta.titular = "Erick Kogake";
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 2245.64;
		segundaConta.agencia = 6060;
		segundaConta.numero = 2040;
		
		
		System.out.println(primeiraConta.saldo);
		System.out.println(primeiraConta.titular);
		
		System.out.println("A primeira conta tem " + primeiraConta.saldo + " de saldo.");
		System.out.println("A segunda conta tem " + segundaConta.saldo + " de saldo.");
		
	}
}
