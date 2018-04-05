package abdemo;

public class Turkey extends Avian {

    public Turkey(String aN) {
        super(aN);
    }

    String makeSound() {
        return "Gobble Gobble";
    }

    String eat() {
        return "Turkeys eat seeds";
    }
}
