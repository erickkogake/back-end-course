
public class TestaPontoFlutuante {
	public static void main(String[] args) {
		System.out.println("Ol� mundo, vamos arrega�ar nas vari�veis!");
		
		double numeros;
		numeros = 37.6;
		
		System.out.println(numeros);
		
		double divisaoIdades = 3.14 / 2;
		System.out.println(divisaoIdades);
		
		double novaTentativa = 5/2;
		System.out.println(novaTentativa);
		
		double maisUma = 5.0 / 2;
		System.out.println(maisUma);
		// O resultado foi correto na vari�vel maisUma, pois o JAVA aplica a conta da direita para esquerda, ent�o a vari�vel novaTentativa, fez a conta errada porque tinham apenas n�meros inteiros e o JAVA n�o entende que era para ser 2.5 e n�o 2.0.
	}	
}