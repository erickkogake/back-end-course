
public class SistemaInterno {

	public void autentica(Gerente ger) {
		boolean autenticou = ger.autentica(2320);
		if(autenticou) {
			System.out.println("Pode entrar.");
		} else {
			System.out.println("Não pode entrar.");
		}
	}
	
	public void autentica2(EditorVideo ev) {
		boolean autenticou = ev.autentica(2020);
		if(autenticou) {
			System.out.println("Pode entrar no sistema.");
		} else {
			System.out.println("Não pode entrar.");
		}
		
	}
}