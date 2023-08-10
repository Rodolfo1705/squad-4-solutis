package Enterprise;

public class Gerente extends FuncionarioAB{
    public Gerente(String nome, String codFuncional) {
        super(nome, codFuncional);
    }

    @Override
    public double calcularRendaAdicional() {
        return getRendaBasica() + 1500;
    }

}
