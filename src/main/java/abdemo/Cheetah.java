package abdemo;

public class Cheetah extends Feline{

    public Cheetah(String aN) {
        super(aN);
    }


    String makeSound() {
        return "Roar";
    }

    String eat() {
        return "Cheetahs eat Antelope";
    }
}
