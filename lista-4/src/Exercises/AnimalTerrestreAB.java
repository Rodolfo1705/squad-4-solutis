package Exercises;

public abstract class AnimalTerrestreAB extends AnimalAB{
    protected int quantidadePatas;
    public double quantidadeComida;
    public double distanciaPercurso;
    public double horasSono;

    public AnimalTerrestreAB(String nome, String habitat, String tipoAnimal, int idade, double altura, double peso, int quantidadePatas, double quantidadeComida, double distanciaPercurso, double horasSono) {
        super(nome, "Terrestre", tipoAnimal, idade, altura, peso);
        this.quantidadePatas = quantidadePatas;
        this.quantidadeComida = quantidadeComida;
        this.distanciaPercurso = distanciaPercurso;
        this.horasSono = horasSono;
    }

    @Override
    public void moverse() {
        andar();
    }

    public static void andar() {
        System.out.println("O animal está andando.");
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public double getQuantidadeComida() {
        return quantidadeComida;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercurso;
    }

    public double getHorasSono() {
        return horasSono;
    }
}
