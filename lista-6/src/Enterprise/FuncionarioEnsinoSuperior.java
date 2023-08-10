package Enterprise;

public class FuncionarioEnsinoSuperior extends FuncionarioAB{
    public String getNomeUniversidade() {
        return nomeUniversidade;
    }

    private final String nomeUniversidade;
    public FuncionarioEnsinoSuperior(String nome, String codFuncional, String nomeUniversidade, double comissao ) {
        super(nome, codFuncional, comissao);
        this.nomeUniversidade = nomeUniversidade;
    }

    @Override
    public double calcularRendaTotal(){
        return getRendaBasica() + getRendaBasica();
    }
}
