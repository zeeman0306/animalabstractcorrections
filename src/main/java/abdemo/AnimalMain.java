package abdemo;

public class AnimalMain {
    public static void main(String[] args) {

    Cheetah cheetahOne = new Cheetah("Cheetah");
    Chicken chickenOne = new Chicken("Chicken");
    Coyote coyoteOne = new Coyote("Coyote");
    Duck duckOne = new Duck("Duck");
    Panther pantherOne = new Panther("Panther");
    Turkey turkeyOne = new Turkey("Turkey");
    Wolf wolfOne = new Wolf("Wolf");



   Animal[] AnimalArr = new Animal[]{cheetahOne, chickenOne, coyoteOne, duckOne, pantherOne, turkeyOne, wolfOne};
   for(Animal eats: AnimalArr){
       System.out.println("===================================================================================");
       System.out.println("All animals eat, but " + eats.eat());
   }







    }
}
