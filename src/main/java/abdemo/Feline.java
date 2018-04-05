package abdemo;

public abstract class Feline extends Animal{

    //Instance Variables


    //Constructor
    public Feline(String aN) {
        super(aN);
    }



    String makeSound() {
        return "Meow - Meow";
    }

    String eat() {
        return "Birds";
    }

}
