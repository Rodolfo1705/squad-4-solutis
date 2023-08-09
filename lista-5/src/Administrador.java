import java.util.List;

public class Administrador extends Empregado {
    private double ajudaDeCusto; //ajudas referentes a viagens, estadias...

    public Administrador(Empregado empregado, double ajudaDeCusto) {
        super(empregado.getNome(), empregado.getEndereço(), empregado.getTelefone(), empregado.getCpf(), empregado.getCodigoSetor(), empregado.getSalarioBase(), empregado.getImposto());
        this.ajudaDeCusto = ajudaDeCusto;
    }

    protected static Administrador buscarAdministrador(List<Administrador> administradoresCadastrados, String cpf){
        for (Administrador administrador : administradoresCadastrados) {
            if (administrador.getCpf().equalsIgnoreCase(cpf)) {
                return administrador;
            }
        }
        return null;
    }

    protected double calcularSalario(double salarioBase, double imposto, double ajudaDeCusto){
        return (ajudaDeCusto + salarioBase) - imposto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
}
