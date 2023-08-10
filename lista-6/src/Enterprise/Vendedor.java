package Enterprise;

public class Vendedor extends FuncionarioAB implements Comissao{
    public Vendedor(String nome, String codFuncional) {
        super(nome, codFuncional);
    }

    @Override
    public double calcularRendaAdicional() {
        return getRendaBasica() + calcularComissao();
    }

    @Override
    public double calcularComissao() {
        return 250;
    }
}
