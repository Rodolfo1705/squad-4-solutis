package Zoo;

public class Cachorro extends AnimalAB{
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au! Au!");
    }

    @Override
    public void moverse() {
        correr();
    }

    @Override
    public AnimalIF clone() {
        return new Cachorro(getNome(), getIdade());
    }

    @Override
    public boolean podeCorrer() {
        return true;
    }

    public void correr(){
        System.out.println(this.getNome() + " está correndo.");
    }
}
