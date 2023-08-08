package Exercises;

public abstract class AnimalAB implements AnimalIF {
    protected String nome;
    protected String habitat;
    protected String tipoAnimal;
    protected int idade;
    protected double altura;
    protected double peso;

    public AnimalAB(String nome, String habitat, String tipoAnimal, int idade, double altura, double peso) {
        this.nome = nome;
        this.habitat = habitat;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public void comer() {
        System.out.println("O animal está comendo.");
    }

    @Override
    public abstract void moverse();

    @Override
    public void dormir() {
        System.out.println("O animal está dormindo.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
