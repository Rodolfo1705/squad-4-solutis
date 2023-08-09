package Exercises;

public class Leão extends AnimalTerrestreAB {

    public Leão(String nome, String habitat, String tipoAnimal, int idade, double altura, double peso, int quantidadePatas, double quantidadeComida, double distanciaPercurso, double horasSono) {
        super(nome, habitat, "Leão", idade, altura, peso, quantidadePatas, quantidadeComida, distanciaPercurso, horasSono);
    }
    @Override
    public void comer() {
        quantidadeComida += 3;
        System.out.println(getNome() + " está comendo.");
    }

    @Override
    public void moverse() {
        distanciaPercurso += 2.0;
        System.out.println(getNome() + " está andado.");
    }

    @Override
    public void dormir() {
        horasSono += 4.0;
        System.out.println(getNome() + " está dormindo.");
    }
}
