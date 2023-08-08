package Exercises;

public abstract class AnimalMarinhoAB extends AnimalAB {
    public AnimalMarinhoAB(String nome, String habitat, String tipoAnimal, int idade, double altura, double peso) {
        super(nome, "Marinho", tipoAnimal, idade, altura, peso);
    }
    @Override
    public void moverse() {
        nadar();
    }

    public static void nadar() {
        System.out.println("O animal está nadando.");
    }

}
