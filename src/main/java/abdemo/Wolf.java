package abdemo;

public class Wolf extends Canine{



    public Wolf(String aN) {
        super(aN);
    }

    String makeSound() {
        return "Arooo";
    }

    String eat() {
        return "Wolves eat small animals";
    }
}
