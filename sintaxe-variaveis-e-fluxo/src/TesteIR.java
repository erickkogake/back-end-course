
public class TesteIR {

	    public static void main(String[] args) {

	        double salario = 3300.0;
	        
	        System.out.println("Mediante sal�rio de Jo�o de $3300.00, podemos destacar que o valor aproximado que ele ter� de pagar �: ");
	        
	        if(salario >= 1900.0 && salario <= 2800.0) {
	        	System.out.println("De 1900.0 at� 2800.0, o IR � de 7.5%");
	        	System.out.println("Pode deduzir na declara��o o valor de $142.");
	        } else {
	        	if (salario >= 2800.01 && salario <= 3751.0) {
	        		System.out.println("De 2800.01 at� 3751.0, o IR � de 15%");
	        		System.out.println("Pode deduzir na declara��o o valor de $350.");
	        	} else {
	        		if (salario >= 3751.01 && salario <= 4664.00) {
	        			System.out.println("De 3751.01 at� 4664.00, o IR � de 22.5%");
	        			System.out.println("Pode deduzir na declara��o o valor de $636.");
	        		}
	        	}
	        }
	        
	    }
	}


