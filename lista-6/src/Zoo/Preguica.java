package Zoo;

public class Preguica extends AnimalAB{
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Aahhh! Aahhh!");
    }

    @Override
    public void moverse() {
        subirEmArvore();
    }

    @Override
    public AnimalIF clone() {
        return new Preguica(getNome(), getIdade());
    }

    @Override
    public boolean podeCorrer() {
        return false;
    }

    public void subirEmArvore(){
        System.out.println(this.getNome() + " está em cima da árvore.");
    }
}
