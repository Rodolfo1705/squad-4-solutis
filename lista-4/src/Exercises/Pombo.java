package Exercises;

public class Pombo extends AnimalVoadorAB {
    public Pombo(String nome, String habitat, String tipoAnimal, int idade, double altura, double peso, int quantidadeAsas, double envergaduraAsa) {
        super(nome, habitat, "Pombo", idade, altura, peso, quantidadeAsas, envergaduraAsa);
    }

    @Override
    public void voando() {
        System.out.println(getNome() + " está voando.");
    }
}
