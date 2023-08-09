package Zoo;

public class Veterinario {

    public static void examinar(AnimalAB animal){
        System.out.println(animal.nome + " está sendo examinado.");
        animal.emitirSom();
    }
}
