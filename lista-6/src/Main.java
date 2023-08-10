import Zoo.*;

public class Main {
    public static void main(String[] args) {
        //pegarInstanciasDeAnimal(); Exercício 4


    }

    private static void emitirSomAnimal(AnimalIF animal){
        animal.emitirSom();
    }

    private static void pegarInstanciasDeAnimal(){
        AnimalIF[] animals = new AnimalIF[3];

        animals[0] = new Cachorro("Thor", 8);
        animals[1] = new Cavalo("Relâmpago", 12);
        animals[2] = new Preguica("Soneca", 3);

        for (AnimalIF animal : animals) {
            emitirSomAnimal(animal); //Exercício 2
            Veterinario.examinar(animal); //Exercício 3
        }

        Zoologico zoologico = new Zoologico();
        zoologico.populateJails();

        for (int i = 0; i < zoologico.getJaulas().length; i++){
            AnimalIF jaulaAtual = zoologico.getJaulas()[i];
            jaulaAtual.emitirSom();

            if(jaulaAtual.podeCorrer()){
                jaulaAtual.moverse();
            }
        }

    }
}