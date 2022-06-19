
public class TesteSi {

	public static void main(String[] args) {
		Gerente Gabriel = new Gerente();
		Gabriel.setSenha(2320);
		
		EditorVideo Fernando = new EditorVideo();
		Fernando.setSenha(2020);
		
		SistemaInterno primeiro = new SistemaInterno();
		primeiro.autentica(Gabriel);
		
		Gabriel.setSenha(2425);
		primeiro.autentica(Gabriel);
		primeiro.autentica2(Fernando);
		
		Fernando.setSenha(5450);
		primeiro.autentica2(Fernando);
	
	}
}
