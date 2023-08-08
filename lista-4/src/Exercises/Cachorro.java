package Exercises;

public class Cachorro extends AnimalTerrestreAB {

    public Cachorro(String nome, String habitat, String tipoAnimal, int idade, double altura, double peso, int quantidadePatas, double quantidadeComida, double distanciaPercurso, double horasSono) {
        super(nome, habitat, "Cachorro", idade, altura, peso, quantidadePatas, quantidadeComida, distanciaPercurso, horasSono);
    }

    @Override
    public void comer() {
        quantidadeComida += 1;
        System.out.println(getNome() + " está comendo.");
    }

    @Override
    public void moverse() {
        distanciaPercurso += 1.0;
        System.out.println(getNome() + " está andado.");
    }

    @Override
    public void dormir() {
        horasSono += 2.0;
        System.out.println(getNome() + " está dormindo.");
    }
}
