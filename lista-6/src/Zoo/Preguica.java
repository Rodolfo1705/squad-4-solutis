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

    public void subirEmArvore(){
        System.out.println(this.nome + " está em cima da árvore.");
    }
}
