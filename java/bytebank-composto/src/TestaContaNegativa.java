
public class TestaContaNegativa {
	public static void main(String[] args) {
		Conta contaDoErick = new Conta();
		contaDoErick.deposita(200);
		
		Conta contaDoJoao = new Conta();
		contaDoJoao.deposita(300);
		
		contaDoErick.transfere(300, contaDoJoao);
		contaDoErick.saca(150);
		
		System.out.println(contaDoErick.getSaldo());
	}

}
