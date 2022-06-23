
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 17;
		int quantidadePessoas = 4;
		boolean acompanhado = quantidadePessoas >= 4;
		
		System.out.println("O valor de acompanhado é = " + acompanhado);

		if (idade >= 18 || acompanhado) {
			System.out.println("Pode entrar.");
			System.out.println("Seja muito bem-vindo!");
		} else {
			System.out.println("Infelizmente, você não tem idade o suficiente para entrar.");
		}
	}
}
