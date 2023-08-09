import java.util.List;

public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public Vendedor(Empregado empregado, double valorVendas, double comissao) {
        super(empregado.getNome(), empregado.getEndereço(), empregado.getTelefone(), empregado.getCpf(), empregado.getCodigoSetor(), empregado.getSalarioBase(), empregado.getImposto());
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    protected static Vendedor buscarVendedor(List<Vendedor> vendedorCadastrados, String cpf){
        for (Vendedor vendedor : vendedorCadastrados) {
            if (vendedor.getCpf().equalsIgnoreCase(cpf)) {
                return vendedor;
            }
        }
        return null;
    }
    protected static double calcularSalario(double salarioBase, double imposto, double valorVendas, double comissao){
        return (valorVendas * comissao) + salarioBase - imposto;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
