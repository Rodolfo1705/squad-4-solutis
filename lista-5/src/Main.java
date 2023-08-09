import Utils.InputHandler;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Pessoa> pessoasCadastradas = new ArrayList<>();
        List<Fornecedor> fornecedoresCadastrados = new ArrayList<>();
        List<Empregado> empregadosCadastrados = new ArrayList<>();
        List<Administrador> administradoresCadastrados = new ArrayList<>();
        List<Operario> operariosCadastrados = new ArrayList<>();
        List<Vendedor> vendedoresCadastrados = new ArrayList<>();
        String[] setor = {"Administrador", "Operario", "Vendedor", "Outros"};

        //Para testes sem precisar realizar o cadastramento
        teste(pessoasCadastradas, fornecedoresCadastrados, empregadosCadastrados, administradoresCadastrados, operariosCadastrados, vendedoresCadastrados);

        int opcao;

        do{
            System.out.println("\n---- Menu ----");
            System.out.println("1 - Criar pessoa");
            System.out.println("2 - Criar fornecedor");
            System.out.println("3 - Criar empregado");
            System.out.println("4 - Exibir salário do empregado");
            System.out.println("5 - Exibir saldo para com o fornecedor");
            System.out.println("6 - Sair");
            opcao = InputHandler.getIntInput("");

            switch (opcao){
                case 1: {
                    Pessoa pessoa = Pessoa.criarPessoa();
                    pessoasCadastradas.add(pessoa);
                    break;
                }
                case 2: {
                    Fornecedor fornecedor = Fornecedor.criarFornecedor(pessoasCadastradas);
                    if (fornecedor != null){
                        fornecedoresCadastrados.add(fornecedor);
                    }
                    break;
                }
                case 3: {
                    Empregado empregadoGeral = Empregado.criarEmpregado(pessoasCadastradas);
                    if (empregadoGeral != null) {
                        empregadosCadastrados.add(empregadoGeral);
                        Empregado.criarEmpregadoEspecifico(empregadoGeral, administradoresCadastrados, operariosCadastrados, vendedoresCadastrados);
                    }
                    break;
                }
                case 4: {
                    String cpf = InputHandler.getStringInput("Digite o cpf do empregado: ");
                    Empregado empregado = Empregado.buscarEmpregado(empregadosCadastrados, cpf);

                    if(empregado != null) {
                        System.out.println("Nome do empregado: " + empregado.getNome());
                        System.out.println("Setor de " + empregado.getNome() + ": " + setor[empregado.getCodigoSetor() - 1]);
                        System.out.println("Salário base de " + empregado.getNome() + ": " + empregado.getSalarioBase());
                        System.out.println("Valor do imposto pago por " + empregado.getNome() + ": " + empregado.getImposto());
                        switch (empregado.getCodigoSetor()) {
                            case 1: {
                                Administrador administrador = Administrador.buscarAdministrador(administradoresCadastrados, cpf);
                                System.out.println("Ajuda de custo: " + administrador.getAjudaDeCusto());
                                System.out.println("Salário final: " + administrador.calcularSalario(administrador.getSalarioBase(), administrador.getImposto(), administrador.getAjudaDeCusto()));
                                break;
                            }
                            case 2: {
                                Operario operario = Operario.buscarOperario(operariosCadastrados, cpf);
                                System.out.println("Comissão: " + (operario.getValorProducao() * operario.getComissao()));
                                System.out.println("Salário final: " + operario.calcularSalario(operario.getSalarioBase(), operario.getImposto(), operario.getValorProducao(), operario.getComissao()));
                                break;
                            }
                            case 3: {
                                Vendedor vendedor = Vendedor.buscarVendedor(vendedoresCadastrados, cpf);
                                System.out.println("Comissão: " + (vendedor.getValorVendas() * vendedor.getComissao()));
                                System.out.println("Salário final: " + vendedor.calcularSalario(vendedor.getSalarioBase(), vendedor.getImposto(), vendedor.getValorVendas(), vendedor.getComissao()));
                                break;
                            }
                        }
                    } else {
                        System.out.println("Pessoa não encontrada!");
                    }
                    break;
                }
                case 5: {
                    String cpf = InputHandler.getStringInput("Digite o cpf do fornecedor: ");
                    Fornecedor fornecedor = Fornecedor.buscarFornecedor(fornecedoresCadastrados, cpf);

                    if(fornecedor != null) {
                        System.out.println("Nome do fornecedor: " + fornecedor.getNome());
                        System.out.println("Crédito do fornecedor: " + fornecedor.getValorCredito());
                        System.out.println("Dívida do fornecedor: " + fornecedor.getValorDivida());
                        System.out.println("Saldo: " + fornecedor.obterSaldo(fornecedor.getValorCredito(), fornecedor.getValorDivida()));
                    } else {
                        System.out.println("Pessoa não encontrada!");
                    }
                    break;
                }
                case 6: break;
                default:
                    System.out.println("Código inválido!");
            }
        } while(opcao != 6);
    }

    public static void teste(List<Pessoa> pessoasCadastradas,List<Fornecedor> fornecedoresCadastrados, List<Empregado> empregadosCadastrados, List<Administrador> administradoresCadastrados, List<Operario> operariosCadastrados, List<Vendedor> vendedoresCadastrados){
        Pessoa pessoa1 = new Pessoa("Maria Clara", "540000", "Centro", "111");
        Pessoa pessoa2 = new Pessoa("Ana Silva", "540000", "Centro", "222");
        Pessoa pessoa3 = new Pessoa("Taís Helena", "540000", "Centro", "333");

        Fornecedor fornecedor1 = new Fornecedor(pessoa1, 2000, 1000);

        Empregado empregado1 = new Empregado(pessoa1, 1, 2000, 100);
        Empregado empregado2 = new Empregado(pessoa2, 2, 2000, 100);
        Empregado empregado3 = new Empregado(pessoa3, 3, 2000, 100);

        Administrador administrador1 = new Administrador(empregado1, 500);
        Operario operario1 = new Operario(empregado2, 500, 2.5);
        Vendedor vendedor1 = new Vendedor(empregado3, 600, 3.1);

        pessoasCadastradas.add(pessoa1);
        pessoasCadastradas.add(pessoa2);
        pessoasCadastradas.add(pessoa3);

        fornecedoresCadastrados.add(fornecedor1);
        empregadosCadastrados.add(empregado1);
        empregadosCadastrados.add(empregado2);
        empregadosCadastrados.add(empregado3);

        administradoresCadastrados.add(administrador1);
        operariosCadastrados.add(operario1);
        vendedoresCadastrados.add(vendedor1);
    }
}