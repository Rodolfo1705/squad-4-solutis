package Zoo;

public abstract class AnimalAB implements AnimalIF{
    protected final String nome;
    protected final int idade;

    public AnimalAB(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public abstract void emitirSom();

    @Override
    public abstract void moverse();
}
