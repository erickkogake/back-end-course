public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	Endereco endereco = new Endereco();

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			if (this.saldo <= valor) {
				this.saldo -= valor;
				System.out.println(
						this.saldo + "  Sua conta está negativa, cuidado utilizar o limite por tempo limitado");
				return true;
			}
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			destino.deposita(valor);
			return true;
		} else {
			if (this.saldo <= valor) {
				this.saldo -= valor;
				System.out.println(
						this.saldo + "  Sua conta está negativa, cuidado utilizar o limite por tempo limitado");
				return true;
			}

			return false;
		}

	}
	
	public double getSaldo() {
		return this.saldo;
	}
}