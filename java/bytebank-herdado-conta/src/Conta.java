	public abstract class Conta {
		
		protected double saldo;
		private int agencia;
		private int numero;
		private Cliente titular;
		private static int total = 0;

		public Conta(int agencia, int numero) {
			total++;
			this.agencia = agencia;
			this.numero = numero;
			this.saldo = 100;
			System.out.println("Estou criando uma conta " + this.numero);
		}

		public abstract void deposita(double valor);

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
							this.saldo + "  Sua conta esta negativa, cuidado utilizar o limite por tempo limitado");
					return true;
				}

				return false;
			}

		}

		public double getSaldo() {
			return this.saldo;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public int getAgencia() {
			return agencia;
		}

		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}

		public void setTitular(Cliente titular) {
			this.titular = titular;
		}

		public Cliente getTitular() {
			return titular;
		}

		public static int getTotal() {
			return total;
		}
	}