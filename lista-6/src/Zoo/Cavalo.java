package Zoo;

public class Cavalo extends AnimalAB{
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Iiirrrrí!");
    }

    @Override
    public void moverse() {
        correr();
    }

    public void correr(){
        System.out.println(this.nome + " está correndo.");
    }
}
