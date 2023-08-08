public class ProgramaBanco {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        Cliente cliente = new Cliente();

        cliente.setCpf("999.888.777-66");
        cliente.setEndereco("Rua Amazonas, Jardim Minas Gerais, SP, Brasil");
        cliente.setNome("Rodolfo");
        cliente.setAnoNascimento("17/05/2005");

        contaCorrente.setNumero("555");
        contaCorrente.setTipo("Conta salário");
        contaCorrente.setPrimeiroTitular(cliente);
        contaCorrente.setLimiteTotal(3000);

        contaCorrente.resumo();

        contaCorrente.credito(300);
        contaCorrente.resumo();

        contaCorrente.debito(4000);
        contaCorrente.resumo();

        contaCorrente.debito(1000);
        contaCorrente.resumo();

        contaCorrente.credito(2000);
        contaCorrente.resumo();
    }
}