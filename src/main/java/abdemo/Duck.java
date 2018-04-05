package abdemo;

public class Duck extends Avian{

    public Duck(String aN) {
        super(aN);
    }

    String makeSound() {
        return "quack quack";
    }

    String eat() {
        return "Ducks eat seeds";
    }
}
