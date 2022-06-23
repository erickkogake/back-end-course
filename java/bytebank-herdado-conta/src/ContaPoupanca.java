
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
	
	@Override
	public boolean transfere(double valor, Conta destino) {
		double TaxaTransferencia = valor + 1.0;
		return super.transfere(TaxaTransferencia, destino);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor; //super.saldo = super.saldo + valor;
	}
}

	