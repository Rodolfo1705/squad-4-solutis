package Zoo;

import java.util.Random;

public class Zoologico {
    public Zoologico(){
        animais[0] = new Cachorro("Mel", 15);
        animais[1] = new Cavalo("Bolt", 10);
        animais[2] = new Preguica("Sonera", 2);
    }
    private final AnimalIF[] jaulas = new AnimalIF[10];
    private final AnimalIF[] animais = new AnimalIF[3];

    public AnimalIF[] getJaulas(){
        return this.jaulas;
    }

    public void populateJails(){
        for (int i = 0; i < 10; i++){
            jaulas[i] = getRandomAnimal();
        }
    }

    public AnimalIF getRandomAnimal(){
        Random random = new Random();
        int randomIndex = random.nextInt(3);

        return animais[randomIndex].clone();
    }

}
