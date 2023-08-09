import Utils.InputHandler;

import java.util.List;

public class Fornecedor extends Pessoa {

    private Pessoa pessoa;
    private double valorCredito; //(correspondente ao crédito máximo atribuído ao fornecedor)
    private double valorDivida; //(montante da dívida para com o fornecedor)

    public Fornecedor(Pessoa pessoa, double valorCredito, double valorDivida) {
        super(pessoa.getNome(), pessoa.getEndereço(), pessoa.getTelefone(), pessoa.getCpf());
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public static double obterSaldo(double valorCredito, double valorDivida){
        return valorCredito - valorDivida;
    }

    protected static Fornecedor criarFornecedor(List<Pessoa> pessoasCadastradas){
        String cpf = InputHandler.getStringInput("Digite o cpf da pessoa: ");

        Pessoa pessoa = Pessoa.bucarPessoa(pessoasCadastradas, cpf);

        if(pessoa != null) {
            double credito = InputHandler.getDoubleInput("Digite o crédito máximo atribuído ao fornecedor: ");
            double divida = InputHandler.getDoubleInput("Digite a dívida para com o fornecedor: ");
            return new Fornecedor(pessoa, credito, divida);
        } else {
            return null;
        }
    }

    protected static Fornecedor buscarFornecedor(List<Fornecedor> fornecedoresCadastrados, String cpf){
        for (Fornecedor fornecedor : fornecedoresCadastrados) {
            if (fornecedor.getCpf().equalsIgnoreCase(cpf)) {
                return fornecedor;
            }
        }
        return null;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
}