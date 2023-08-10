package Enterprise;

public class FuncionarioEnsinoMedio extends FuncionarioEscola{
    public FuncionarioEnsinoMedio(String nome, String codFuncional, String nomeEscola, double comissao ){
        super(nome, codFuncional, nomeEscola, comissao);
    }

    @Override
    public double calcularRendaTotal(){
        return getRendaBasica() + (getRendaBasica() * 0.5);
    }
}
