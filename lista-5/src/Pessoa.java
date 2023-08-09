import Utils.InputHandler;
import java.util.List;

public class Pessoa {
    private String nome;
    private String endereço;
    private String telefone;
    private String cpf;

    protected Pessoa(String nome, String endereço, String telefone, String cpf) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    protected static Pessoa bucarPessoa(List<Pessoa> pessoasCadastradas, String cpf){
        for (Pessoa pessoa : pessoasCadastradas) {
            if (pessoa.getCpf().equalsIgnoreCase(cpf)) {
                return pessoa;
            }
        }
        System.out.println("Pessoa não encontrada.");
        return null;
    }

    protected static Pessoa criarPessoa(){
        String nome =  InputHandler.getStringInput("Digite o nome da pessoa: ");
        String cpf = InputHandler.getStringInput("Digite o cpf de " + nome + ": ");
        String endereco =  InputHandler.getStringInput("Digite o endereço de " + nome + ": ");
        String telefone = InputHandler.getStringInput("Digite o telefone de " + nome + ": ");

        return new Pessoa(nome, telefone, endereco, cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}