public class ControleBoni2 {
    private double soma;

    public void registra2(Funcionario2 f) {
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
    }

    public double getSoma() {
        return soma;
    }
}
