public class ContaCorrente {
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrimeiroTitular(Cliente primeiroTitular) {
        this.primeiroTitular = primeiroTitular;
    }

    public void setLimiteTotal(double limiteTotal) {
        this.limiteTotal = limiteTotal;
    }

    private String numero;
    private String tipo;
    private Cliente primeiroTitular;
    private Cliente segundoTitular;
    private double saldo = 0;
    private double limiteTotal;

    public void credito(double valor){
        System.out.println("Crédito realizado com sucesso! valor: R$" + valor);
        this.saldo += valor;
    }

    public void debito(double valor){
        if(valor > (this.limiteTotal + this.saldo)){
            System.out.println("Débito inválido, limite insuficiente para o valor de R$" + valor);
            return;
        }

        System.out.println("Débito realizado com sucesso! valor: R$" + valor);
        this.saldo -= valor;
    }

    public void resumo(){
        System.out.println("Número da conta corrente: " + this.numero);
        System.out.println("Nome do primeiro titular: " + this.primeiroTitular.getNome());
        if(segundoTitular != null){
            System.out.println("Nome do segundo titular: " + this.segundoTitular);
        }
        System.out.println("Saldo atual: " + this.saldo);
        System.out.println("Limite atual: " + (this.limiteTotal + this.saldo));
        System.out.println("Limite total: " + this.limiteTotal);

        if (estaDevedor()){
            System.out.println("Procure o seu gerente!");
        }
    }

    public boolean estaDevedor(){
        return saldo < 0;
    }
}
