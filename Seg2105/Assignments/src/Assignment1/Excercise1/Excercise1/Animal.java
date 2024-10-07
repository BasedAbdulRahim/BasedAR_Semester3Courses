/*
An abstraact class which mimics an animal 
This class holds the methods getAnimalType, makeSound and getNumberOfAnimals

*/



public abstract class Animal implements SoundMaker {
	
	protected String name;
    private static int numberOfAnimals = 0;

    public Animal() { // Constructor
		numberOfAnimals++; // new animal 
		name = "Unknown Animal"; // animal has no name 
		System.out.println("Animal Constructor Called");
		
	}
	
	public Animal(String nameOfAnimal) { // Constructor with parameter
		numberOfAnimals++;// new animal 
		name = nameOfAnimal; // name of animal 
		System.out.println("Animal Constructor with name Called");
	}

	public abstract String getAnimalType();// no current animal type 
		
	
    public void makeSound() { // sound of an animal 
        System.out.println("Animal sound");
    }

    public static int getNumberOfAnimals() { // number of different animals 
        return numberOfAnimals;
    }
}
