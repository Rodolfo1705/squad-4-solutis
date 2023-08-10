package Enterprise;

public class Supervisor extends FuncionarioAB{
    public Supervisor(String nome, String codFuncional) {
        super(nome, codFuncional);
    }

    @Override
    public double calcularRendaAdicional() {
        return getRendaBasica() + 600;
    }
}
