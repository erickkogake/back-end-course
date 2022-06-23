
public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1470.00;
		//int valor = salario;  // neste caso o JAVA não compila, pois não funciona um double, dentro de uma int.
		int valors = (int) salario; // neste caso compila, pois estamos forçando o JAVA a compilar a váriável usando o castindo (int).
	
		System.out.println(valors);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1+valor2;
		
		System.out.println(total);
	}
}
