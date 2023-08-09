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

    public void correr(){
        System.out.println(this.nome + " está correndo.");
    }
}
