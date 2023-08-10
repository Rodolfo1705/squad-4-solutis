package Enterprise;

public class Supervisor extends FuncionarioAB implements Comissao{
    public Supervisor(String nome, String codFuncional, double comissao) {
        super(nome, codFuncional, comissao);
        setComissoes(600);
    }

    @Override
    public double calcularRendaTotal() {
        return getRendaBasica() + calcularComissao();
    }


    @Override
    public double calcularComissao() {
        comissoes = 600;

        return comissoes;
    }
}
