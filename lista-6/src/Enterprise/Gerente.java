package Enterprise;

public class Gerente extends FuncionarioAB implements Comissao{
    public Gerente(String nome, String codFuncional, double comissao) {
        super(nome, codFuncional, comissao);
        setComissoes(1500);
    }

    @Override
    public double calcularRendaTotal() {
        return getRendaBasica() + calcularComissao();
    }

    @Override
    public double calcularComissao() {
        comissoes = 1500;

        return comissoes;
    }
}
