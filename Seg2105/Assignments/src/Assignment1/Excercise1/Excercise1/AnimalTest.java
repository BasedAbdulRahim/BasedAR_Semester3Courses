/**
The main class of the program Animal Test
This class tests all forms of animals and counts the total number of Animals, mammals, Birds
aswell as making sure each noise is correct

There are 4 different Array List: mammals, dogs, birds, parrots (implemented by importing javaUtil.ArrayList) 
		*Should be 5 though animal is incompatable
		
		


*/
import java.util.ArrayList;

public class AnimalTest {

    public static void main(String[] args) {

        // Creating ArrayLists for each type of Animal
    	//ArrayList<Animal> animals = new ArrayList<>(); - Removed due to being incompatable 
        ArrayList<Mammal> mammals = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();
        ArrayList<Bird> birds = new ArrayList<>();
        ArrayList<Parrot> parrots = new ArrayList<>();

       /*  - Removed due to being incompatable
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal("Neb"));
        animals.add(new Animal("Wab"));
        */
		
		
     // Adding 4 Mammal objects (2 default, 2 parameterized)
        mammals.add(new Mammal());
        mammals.add(new Mammal());
        mammals.add(new Mammal("Joe"));
        mammals.add(new Mammal("Poe"));
        
     // Adding 4 Bird objects (2 default, 2 parameterized)
        birds.add(new Bird());
        birds.add(new Bird());
        birds.add(new Bird("Fly"));
        birds.add(new Bird("High"));


        // Adding 4 Dog objects (2 default, 2 parameterized)
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog("Bob"));
        dogs.add(new Dog("Rob"));

        
        // Adding 4 Parrot objects (2 default, 2 parameterized)
        parrots.add(new Parrot());
        parrots.add(new Parrot());
        parrots.add(new Parrot("Speak"));
        parrots.add(new Parrot("Beak"));

        // Loop through each ArrayList and call the makeSound() method
        System.out.println("\nMammal Sounds:");
        for (Mammal x : mammals) {
            x.makeSound();
        }
        System.out.println("\nBird Sounds:");
        for (Bird x : birds) {
            x.makeSound();
        }
        System.out.println("\nDog Sounds:");
        for (Dog x : dogs) {
            x.makeSound();
        }
        System.out.println("\nParrot Sounds:");
        for (Parrot x : parrots) {
            x.makeSound();
        }
        
        // Print total number of created instances for each class
        System.out.println("Animals: " + Animal.getNumberOfAnimals()
            + "\nMammals: " + Mammal.getNumberOfMammals()
            + "\nBirds: " + Bird.getNumberOfBirds()
        );
    }
}