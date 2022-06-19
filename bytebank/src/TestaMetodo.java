
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoErick = new Conta();
		contaDoErick.saldo = 200;
		contaDoErick.deposita(50);
		
		System.out.println("O valor da conta de Erick é : " + contaDoErick.saldo + " reias.");
		
		contaDoErick.saca(20);
		System.out.println(contaDoErick.saldo);
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 1000000;
		boolean sucessoTransferencia = contaDoPaulo.transfere(1000, contaDoErick);
		
		if(sucessoTransferencia) {
			System.out.println("Transferência feita com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDoErick.saldo);
		System.out.println(contaDoPaulo.saldo);
		
		
		
	}

}
