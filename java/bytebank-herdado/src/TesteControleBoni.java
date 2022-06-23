
public class TesteControleBoni {
    public static void main(String[] args) {
        Gerente ger1 = new Gerente();

        ger1.setSalario(6000.0);
        ger1.setNome("Tomas Liderson");

        System.out.println(ger1.getSalario() + " esse é o salário do gerente.");

        Funcionario2 f = new Designer();

        f.setSalario(2200.0);

        EditorVideo ev = new EditorVideo();

        ev.setSalario(2500.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(ger1);
        controle.registra(f);
        controle.registra(ev);

        System.out.println(controle.getSoma());

        ControleBoni2 control = new ControleBoni2();
        control.registra2(ger1);
        control.registra2(f);
        control.registra2(ev);

        System.out.println(control.getSoma());
    }
}