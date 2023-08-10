package Enterprise;

public abstract class FuncionarioAB implements FuncionarioIF {
    public String getNome() {
        return nome;
    }

    public String getCodFuncional() {
        return codFuncional;
    }

    public double getRendaBasica() {
        return rendaBasica;
    }

    public void setComissoes(double comissoes) {
        this.comissoes = comissoes;
    }

    private final String nome;
    private final String codFuncional;
    private final double rendaBasica = 1000.0;

    protected double comissoes;

    public FuncionarioAB(String nome, String codFuncional, double comissoes) {
        this.nome = nome;
        this.codFuncional = codFuncional;
        this.comissoes = comissoes;
    }

    @Override
    public abstract double calcularRendaTotal();

    @Override
    public String toString() {
        return "FuncionarioAB{ nome='" + nome + '\'' +
                ", comissoes=" + comissoes + '\'' +
                ", rendaTotal=" + calcularRendaTotal() +
                '}';
    }
}
