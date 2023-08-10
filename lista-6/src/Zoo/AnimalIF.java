package Zoo;

public interface AnimalIF {
    String getNome();
    int getIdade();
    void emitirSom();

    void moverse();

    AnimalIF clone();

    boolean podeCorrer();
}
