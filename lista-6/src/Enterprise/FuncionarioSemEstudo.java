package Enterprise;

public class FuncionarioSemEstudo extends FuncionarioAB{
    public FuncionarioSemEstudo(String nome, String codFuncional, double comissao){
        super(nome, codFuncional, comissao);
    }

    @Override
    public double calcularRendaTotal(){
        return this.getRendaBasica();
    }
}
