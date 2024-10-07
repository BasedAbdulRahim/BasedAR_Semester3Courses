/*
A class which mimics an Bird 
This class holds the methods getAnimalType, makeSound and getNumberOfBirds

*/


public class Bird extends Animal {
	
	private static int numberOfBirds=0; // current number of different birds 
	
	
	
	public Bird() { // constructor 
		super();// calls the animal class constructor 
		numberOfBirds++;//incremenets numberOfBirds by 1 
		System.out.println("Bird Constructor Called");
		
		
	}
	
	public Bird(String nameOfAnimal) {
		super(nameOfAnimal); // calls the animal class constructor
		numberOfBirds++;//incremenets numberOfBirds by 1  
		System.out.println("Bird Constructor with name Called");
		
		
	}
	
	public void makeSound() { // sound of a Bird  
		System.out.println("Bird sound");

	}
	
	public String getAnimalType() { //returns the animal type "Bird" 
		return "Bird";
	}
	
	public static int getNumberOfBirds() { // returns number of different Birds 
		return numberOfBirds;
	}


}
