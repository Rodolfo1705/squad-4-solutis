package Zoo;

public abstract class AnimalAB implements AnimalIF{
    private final String nome;
    private final int idade;
    @Override
    public String getNome(){
        return this.nome;
    }

    @Override
    public int getIdade(){
        return this.idade;
    }

    public AnimalAB(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public abstract AnimalIF clone();

    @Override
    public abstract void emitirSom();

    @Override
    public abstract void moverse();
}
