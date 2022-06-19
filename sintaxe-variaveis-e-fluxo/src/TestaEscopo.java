
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 17;
		int quantidadePessoas = 4;
		boolean acompanhado = quantidadePessoas >= 4;
		
		System.out.println("O valor de acompanhado é = " + acompanhado);

		boolean acompanhados;
		if (quantidadePessoas >=3) {
			acompanhados = true;
		} else {
			acompanhados = false;
		}
		
		if (idade >= 18 || acompanhados) {
			System.out.println("Pode entrar.");
			System.out.println("Seja muito bem-vindo!");
		} else {
			System.out.println("Infelizmente, você não tem idade o suficiente para entrar.");
		}
	}

}









