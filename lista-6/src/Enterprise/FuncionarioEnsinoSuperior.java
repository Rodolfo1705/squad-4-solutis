package Enterprise;

public class FuncionarioEnsinoSuperior extends FuncionarioAB{
    public String getNomeUniversidade() {
        return nomeUniversidade;
    }

    private final String nomeUniversidade;
    public FuncionarioEnsinoSuperior(String nome, String codFuncional, String nomeUniversidade) {
        super(nome, codFuncional);
        this.nomeUniversidade = nomeUniversidade;
    }

    @Override
    public double calcularRendaAdicional(){
        return getRendaBasica() + getRendaBasica();
    }
}
