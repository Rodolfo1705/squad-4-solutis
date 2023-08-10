package Enterprise;

public class Gerente extends FuncionarioAB implements Comissao{
    public Gerente(String nome, String codFuncional) {
        super(nome, codFuncional);
    }

    @Override
    public double calcularRendaAdicional() {
        return getRendaBasica() + calcularComissao();
    }

    @Override
    public double calcularComissao() {
        return 1500;
    }
}
