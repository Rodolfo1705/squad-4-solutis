package Enterprise;

public class Supervisor extends FuncionarioAB implements Comissao{
    public Supervisor(String nome, String codFuncional) {
        super(nome, codFuncional);
    }

    @Override
    public double calcularRendaAdicional() {
        return getRendaBasica() + calcularComissao();
    }


    @Override
    public double calcularComissao() {
        return 600;
    }
}
