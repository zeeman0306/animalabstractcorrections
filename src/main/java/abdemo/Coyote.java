package abdemo;

public class Coyote extends Canine {


    public Coyote(String aN) {
        super(aN);
    }


    String makeSound() {
        return "howls";
    }

    String eat() {
        return "Cyotes eat lizards";
    }
}
