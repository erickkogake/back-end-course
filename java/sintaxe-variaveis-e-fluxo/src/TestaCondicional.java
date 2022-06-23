
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 17;
		int idadeAcompanhante = 22;

		if (idade >= 18) {
			System.out.println("Você é maior de 18.");
			System.out.println("Seja muito bem-vindo!");
		} else {
			if (idadeAcompanhante >= 18) {
				System.out.println("Você pode entrar, pois está acompanhado por um adulto.");
				System.out.println("Seja muito bem-vindo!");
			} else {
				System.out.println("Infelizmente, você não tem idade o suficiente para entrar.");
			}
		}
	}
}
