# Exercício 1

<b>Conta Corrente:</b> 
- Atributos
    - String numero, String tipo, Cliente primeiroTitular, Cliente segundoTitular, double saldo, double limiteTotal;

- Métodos: 
    - credito(double valor) - aumenta o saldo com o valor informado.
    - debito(double valor) - diminui o saldo com o valor informado.
    - resumo() - imprime na tela:
        - Número da Conta Corrente
        - Nome do primeiro titular
        - Nome do segundo titular (se existir)
        - Saldo Atual
        - Limite Atual (limite total + saldo atual)
        - Limite total
        - Se estiver devedor mostrar no final do resumo a mensagem "Procure o seu gerente!"
    - estaDevedor() - retorna true se o saldo for menor que zero, retorna false se o saldo for maior ou igual a zero.

<b>Cliente:</b> 
- Atributos
    - String cpf, String nome, String endereco, String anoNascimento;

Na classe ProgramaBanco.java (com main), crie uma conta corrente, atualize todos os atributos obrigatórios, faça alguns créditos e alguns débitos e depois imprima o resumo na conta corrente.
