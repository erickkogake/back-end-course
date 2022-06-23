
public class TestaPontoFlutuante {
	public static void main(String[] args) {
		System.out.println("Olá mundo, vamos arregaçar nas variáveis!");
		
		double numeros;
		numeros = 37.6;
		
		System.out.println(numeros);
		
		double divisaoIdades = 3.14 / 2;
		System.out.println(divisaoIdades);
		
		double novaTentativa = 5/2;
		System.out.println(novaTentativa);
		
		double maisUma = 5.0 / 2;
		System.out.println(maisUma);
		// O resultado foi correto na variável maisUma, pois o JAVA aplica a conta da direita para esquerda, então a variável novaTentativa, fez a conta errada porque tinham apenas números inteiros e o JAVA não entende que era para ser 2.5 e não 2.0.
	}	
}