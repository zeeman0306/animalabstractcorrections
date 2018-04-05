package abdemo;

public class Chicken extends Avian {

    public Chicken(String aN) {
        super(aN);
    }

    String makeSound() {
        return "Buck Buck";
    }

    String eat() {
        return "Chickens eat seeds";
    }
}
