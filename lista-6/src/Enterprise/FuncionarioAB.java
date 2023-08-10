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

    private final String nome;
    private final String codFuncional;
    private final double rendaBasica = 1000.0;

    public FuncionarioAB(String nome, String codFuncional) {
        this.nome = nome;
        this.codFuncional = codFuncional;
    }

    @Override
    public abstract double calcularRendaAdicional();
}
