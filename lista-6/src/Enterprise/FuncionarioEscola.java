package Enterprise;

public class FuncionarioEscola extends FuncionarioAB{
    private String nomeEscola;

    public FuncionarioEscola(String nome, String codFuncional, String nomeEscola, double comissao){
        super(nome, codFuncional, comissao);
        this.nomeEscola = nomeEscola;
    }

    @Override
    public double calcularRendaTotal(){
        return getRendaBasica() + (getRendaBasica() * 0.1);
    }
}
