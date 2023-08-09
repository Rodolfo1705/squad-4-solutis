import Utils.InputHandler;

import java.util.List;

public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase; //(vencimento base)
    private double imposto; //(porcentagem retida dos impostos).

    public Empregado(String nome, String endereço, String telefone, String cpf, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereço, telefone, cpf);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Empregado(Pessoa pessoa, int codigoSetor, double salarioBase, double imposto) {
        super(pessoa.getNome(), pessoa.getEndereço(), pessoa.getTelefone(), pessoa.getCpf());
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Empregado(String nome, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    protected double calcularSalario(double salarioBase, double imposto){
        return salarioBase - imposto;
    }

    protected static Empregado criarEmpregado(List<Pessoa> pessoasCadastradas){
        String cpf = InputHandler.getStringInput("Digite o cpf da pessoa: ");

        Pessoa pessoa = Pessoa.bucarPessoa(pessoasCadastradas, cpf);

        if(pessoa != null) {
            int setor = InputHandler.getIntInput("Digite o código do setor onde " + pessoa.getNome() + " trabalha: (1 - Administrador | 2 - Operario | 3 - Vendedor | 4 - Outro)\n");
            double salarioBase = InputHandler.getDoubleInput("Digite o salário base de " + pessoa.getNome() + ": ");
            double imposto = InputHandler.getDoubleInput("Valor do imposto sobre o salário de " + pessoa.getNome() + ": ");
            return new Empregado(pessoa.getNome(), pessoa.getEndereço(), pessoa.getEndereço(), pessoa.getCpf(), setor, salarioBase, imposto);
        } else {
            return null;
        }
    }
    protected static List criarEmpregadoEspecifico(Empregado empregado, List<Administrador> administradoresCadastrados, List<Operario> operariosCadastrados, List<Vendedor> vendedoresCadastrados){
        switch (empregado.getCodigoSetor()) {
            case 1: {
                double ajudaDeCusto = InputHandler.getDoubleInput("Digite o valor que " + empregado.getNome() + " recebe de ajuda de custo: ");
                Administrador administrador = new Administrador(empregado, ajudaDeCusto);
                administradoresCadastrados.add(administrador);
                return administradoresCadastrados;
            }
            case 2: {
                double valorProducao = InputHandler.getDoubleInput("Digite o valor dos artigos produzidos por " + empregado.getNome() + ": ");
                double comissao = InputHandler.getDoubleInput("Digite o que " + empregado.getNome() + " recebe de comissão sobre os artigos produzidos: ");
                Operario operario = new Operario(empregado, valorProducao, comissao);
                operariosCadastrados.add(operario);
                return operariosCadastrados;
            }
            case 3: {
                double valorVendas = InputHandler.getDoubleInput("Digite o valor dos artigos vendidos por " + empregado.getNome() + ": ");
                double comissao = InputHandler.getDoubleInput("Digite o que " + empregado.getNome() + " recebe de comissão sobre os artigos vendidos: ");
                Vendedor vendedor = new Vendedor(empregado, valorVendas, comissao);
                vendedoresCadastrados.add(vendedor);
                return vendedoresCadastrados;
            }
            default: {
                return null;
            }
        }
    }

    protected static Empregado buscarEmpregado(List<Empregado> empregadosCadastrados, String cpf){
        for (Empregado empregado : empregadosCadastrados) {
            if (empregado.getCpf().equalsIgnoreCase(cpf)) {
                return empregado;
            }
        }
        return null;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}
