import Zoo.*;

public class Main {
    public static void main(String[] args) {


        emitirSomAnimal(pegarInstanciasDeAnimal());

        Veterinario.examinar(pegarInstanciasDeAnimal());
    }

    private static void emitirSomAnimal(AnimalIF animal){
        animal.emitirSom();
    }

    private static AnimalAB pegarInstanciasDeAnimal(){
        AnimalAB[] animals = new AnimalAB[3];

        animals[0] = new Cachorro("Thor", 8);
        animals[1] = new Cavalo("Relâmpago", 12);
        animals[2] = new Preguica("Soneca", 3);


        return animals[0];
    }
}