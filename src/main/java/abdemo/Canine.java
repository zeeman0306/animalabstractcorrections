package abdemo;

public abstract class Canine extends Animal{


    //Instance Variables



    //Constructor
    public Canine(String aN) {
        super(aN);
    }


    String makeSound() {
        return "bork barf!";
    }

    String eat() {
        return "ramen noodles";
    }
}
