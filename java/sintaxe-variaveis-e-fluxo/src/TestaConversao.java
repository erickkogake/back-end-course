
public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1470.00;
		//int valor = salario;  // neste caso o JAVA n�o compila, pois n�o funciona um double, dentro de uma int.
		int valors = (int) salario; // neste caso compila, pois estamos for�ando o JAVA a compilar a v�ri�vel usando o castindo (int).
	
		System.out.println(valors);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1+valor2;
		
		System.out.println(total);
	}
}
