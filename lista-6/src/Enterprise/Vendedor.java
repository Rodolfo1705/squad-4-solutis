package Enterprise;

public class Vendedor extends FuncionarioAB{
    public Vendedor(String nome, String codFuncional) {
        super(nome, codFuncional);
    }

    @Override
    public double calcularRendaAdicional() {
        return getRendaBasica() + 250;
    }
}
