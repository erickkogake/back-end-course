
public class TesteConta {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(2456, 265);
		cc.deposita(200);
		
		ContaPoupanca cp = new ContaPoupanca(3334,248);
		cp.deposita(150);
		
		cc.transfere(20.0, cp);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		cp.saca(10.0);
		
		System.out.println(cp.getSaldo());
		
		cp.transfere(10.0, cc);
		
		System.out.println(cp.getSaldo());
		System.out.println(cc.getSaldo());
	}
}
