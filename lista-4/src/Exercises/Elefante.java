package Exercises;

public class Elefante extends AnimalTerrestreAB {

    public Elefante(String nome, String habitat, String tipoAnimal, int idade, double altura, double peso, int quantidadePatas, double quantidadeComida, double distanciaPercurso, double horasSono) {
        super(nome, habitat, "Elefante", idade, altura, peso, quantidadePatas, quantidadeComida, distanciaPercurso, horasSono);
    }

    @Override
    public void comer() {
        quantidadeComida += 5;
        System.out.println(getNome() + " está comendo.");
    }

    @Override
    public void moverse() {
        distanciaPercurso += 4.0;
        System.out.println(getNome() + " está andado.");
    }

    @Override
    public void dormir() {
        horasSono += 4.0;
        System.out.println(getNome() + " está dormindo.");
    }
}
