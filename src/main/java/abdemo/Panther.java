package abdemo;

public class Panther extends Feline {



    public Panther(String aN) {
        super(aN);
    }


    String makeSound() {
        return "Roar";
    }

    String eat() {
        return "Panthers eat monkeys.";
    }
}
