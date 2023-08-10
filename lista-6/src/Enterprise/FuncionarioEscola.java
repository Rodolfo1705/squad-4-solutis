package Enterprise;

public class FuncionarioEscola extends FuncionarioAB{
    private String nomeEscola;

    public FuncionarioEscola(String nome, String codFuncional, String nomeEscola){
        super(nome, codFuncional);
        this.nomeEscola = nomeEscola;
    }

    @Override
    public double calcularRendaAdicional(){
        return getRendaBasica() + (getRendaBasica() * 0.1);
    }
}
