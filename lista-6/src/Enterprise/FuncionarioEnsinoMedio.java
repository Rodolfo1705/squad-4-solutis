package Enterprise;

public class FuncionarioEnsinoMedio extends FuncionarioEscola{
    public FuncionarioEnsinoMedio(String nome, String codFuncional, String nomeEscola ){
        super(nome, codFuncional, nomeEscola);
    }

    @Override
    public double calcularRendaAdicional(){
        return getRendaBasica() + (getRendaBasica() * 0.5);
    }
}
