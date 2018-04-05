package abdemo;

public abstract class Animal {

    //Instance Variables
    private String animalName;


    //Constructor
    public Animal (String aN){
        this.animalName = aN;
    }


    //Method Signature / stubs
    abstract String makeSound();

    abstract String eat();


}
