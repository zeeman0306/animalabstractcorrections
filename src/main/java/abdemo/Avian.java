package abdemo;

public abstract class Avian extends Animal{

    //Instance Variables


    //Constructor
    public Avian (String aN){
        super(aN);
    }


    String makeSound() {
        return "tweet tweet";
    }

    String eat() {
        return "Seeds";
    }
}
