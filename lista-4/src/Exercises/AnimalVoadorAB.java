package Exercises;

public abstract class AnimalVoadorAB extends AnimalAB {
    protected int quantidadeAsas;
    protected double envergaduraAsa;

    public AnimalVoadorAB(String nome, String habitat, String tipoAnimal, int idade, double altura, double peso, int quantidadeAsas, double envergaduraAsa) {
        super(nome, "Aéreo", tipoAnimal, idade, altura, peso);
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsa = envergaduraAsa;
    }

    public abstract void voando();
    @Override
    public void moverse() {
        voando();
    }

    public int getQuantidadeAsas() {
        return quantidadeAsas;
    }

    public void setQuantidadeAsas(int quantidadeAsas) {
        this.quantidadeAsas = quantidadeAsas;
    }

    public double getEnvergaduraAsa() {
        return envergaduraAsa;
    }

    public void setEnvergaduraAsa(double envergaduraAsa) {
        this.envergaduraAsa = envergaduraAsa;
    }

}