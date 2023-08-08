import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaBanco {
    public static void main(String[] args) {
        List<ContaCorrente> contas = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        double valor;

        do {
            System.out.println("--- Menu ---");
            System.out.println("1 - Criar cliente");
            System.out.println("2 - Criar conta");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Exibir dados da conta");
            int dec = scanner.nextInt();
            scanner.nextLine();
            switch (dec){
                case 1: {
                    clientes.add(criarCliente());
                    break;
                }
                case 2: {
                    contas.add(criarConta(clientes));
                    break;
                }
                case 3: {
                    System.out.println("Digite o número da conta para depositar: ");
                    String numeroConta = scanner.nextLine();
                    ContaCorrente conta = encontrarConta(numeroConta, contas);

                    if (conta != null) {
                        System.out.println("Digite o valor a ser creditado: ");
                        valor = scanner.nextDouble();
                        conta.credito(valor);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Digite o número da conta para sacar: ");
                    String numeroConta = scanner.nextLine();
                    ContaCorrente conta = encontrarConta(numeroConta, contas);

                    if (conta != null) {
                        System.out.println("Digite o valor a ser debitado: ");
                        valor = scanner.nextDouble();
                        conta.debito(valor);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                }
                case 5: {
                    System.out.println("Número da conta: ");
                    String numeroConta = scanner.nextLine();
                    ContaCorrente conta = encontrarConta(numeroConta, contas);

                    if (conta != null) {
                        System.out.println("Dados da conta: ");
                        conta.resumo();
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                }
                default: {
                    System.out.println("Opção inválida!");
                }
            }

            System.out.println("Deseja realizar mais uma ação? (1 - Sim | 2 - Não)");
            opcao = scanner.nextInt();
        } while(opcao == 1);

    }

    public static Cliente criarCliente(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de cliente: ");
        System.out.println("Digite o CPF do cliente:");
        String cpf = scanner.nextLine();
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();
        System.out.println("Digite o endereço do cliente:");
        String endereco = scanner.nextLine();
        System.out.println("Digite a data de nascimento do cliente:");
        String dataNascimento = scanner.nextLine();

        return new Cliente(cpf, nome, endereco, dataNascimento);
    }

    public static ContaCorrente criarConta(List<Cliente> clientes){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de conta corrente: ");
        System.out.println("Digite o número da conta corrente:");
        String numero = scanner.next();
        System.out.println("Digite o tipo da conta corrente:");
        String tipo = scanner.next();
        System.out.println("Digite o cpf do titular da conta corrente:");
        String cpf = scanner.next();
        System.out.println("Digite o limite total da conta corrente:");
        double limiteTotal = scanner.nextDouble();

        scanner.nextLine();

        Cliente cliente = encontrarCpf(cpf, clientes);

        System.out.println("Deseja adicionar um segundo titular? (1 - Sim | 2 - Não)");
        int resposta = scanner.nextInt();

        scanner.nextLine();

        if (resposta == 1) {
            System.out.println("Digite o cpf do segundo titular da conta corrente:");
            String cpf2 = scanner.nextLine();

            Cliente cliente2 = encontrarCpf(cpf, clientes);

            return new ContaCorrente(numero, tipo, cliente, cliente2, 0, limiteTotal);
        } else {
            return new ContaCorrente(numero, tipo, cliente, null, 0, limiteTotal);
        }
    }

    private static ContaCorrente encontrarConta(String numero, List<ContaCorrente> contas) {
        for (ContaCorrente conta : contas) {
            if (conta.getNumero().equalsIgnoreCase(numero)) {
                return conta;
            }
        }
        return null;
    }

    private static Cliente encontrarCpf(String cpf, List<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equalsIgnoreCase(cpf)) {
                return cliente;
            }
        }
        return null;
    }
}