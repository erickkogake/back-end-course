
public class TestaSomatorias {
	public static void main(String[] args) {
		
		int contador = 0;
		int total = 1;
		while (contador <= 10) {
			total = total + contador; // poderia ser assim também: (total +=contador;)
			contador++;
			System.out.println(total);
		}
		System.out.println(total);
		
	}
}
