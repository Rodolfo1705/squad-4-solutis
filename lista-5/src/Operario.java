import java.util.List;

public class Operario extends Empregado {
    private double valorProducao; //que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário
    private double comissao; //corresponde à porcentagem do valorProducao que será adicionado ao vencimento base do operário

    public Operario(Empregado empregado, double valorProducao, double comissao) {
        super(empregado.getNome(), empregado.getEndereço(), empregado.getTelefone(), empregado.getCpf(), empregado.getCodigoSetor(), empregado.getSalarioBase(), empregado.getImposto());
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    protected static Operario buscarOperario(List<Operario> operarioCadastrados, String cpf){
        for (Operario operario : operarioCadastrados) {
            if (operario.getCpf().equalsIgnoreCase(cpf)) {
                return operario;
            }
        }
        return null;
    }

    protected static double calcularSalario(double salarioBase, double imposto, double valorProducao, double comissao){
        return (valorProducao * comissao) + salarioBase - imposto;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
