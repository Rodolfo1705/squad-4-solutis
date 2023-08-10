package Enterprise;

public class Vendedor extends FuncionarioAB implements Comissao{
    public Vendedor(String nome, String codFuncional, double comissao) {
        super(nome, codFuncional, comissao);
        setComissoes(250);
    }

    @Override
    public double calcularRendaTotal() {
        return getRendaBasica() + calcularComissao();
    }

    @Override
    public double calcularComissao() {

        return comissoes;
    }
}
