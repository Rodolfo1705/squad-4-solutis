package Enterprise;

public class FuncionarioSemEstudo extends FuncionarioAB{
    public FuncionarioSemEstudo(String nome, String codFuncional){
        super(nome, codFuncional);
    }

    @Override
    public double calcularRendaAdicional(){
        return this.getRendaBasica();
    }
}
