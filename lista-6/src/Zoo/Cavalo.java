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

    @Override
    public AnimalIF clone() {
        return new Cavalo(getNome(), getIdade());
    }

    @Override
    public boolean podeCorrer() {
        return true;
    }

    public void correr(){
        System.out.println(this.getNome() + " está correndo.");
    }
}
