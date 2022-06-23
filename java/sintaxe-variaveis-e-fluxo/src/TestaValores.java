
public class TestaValores {
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
	    primeiro = 10;
	    
	    // O valor da variável segundo, será 10?
	    // Não, pois o valor guardado na variável int primeiro que será, no caso 5. 
		
		System.out.println(segundo);
		
		String palavra = "alura cursos online de tecnologia";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
	}

}
