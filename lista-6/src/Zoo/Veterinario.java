package Zoo;

public class Veterinario {

    public static void examinar(AnimalIF animal){
        System.out.println(animal.getNome() + " está sendo examinado.");
        animal.emitirSom();
    }
}
