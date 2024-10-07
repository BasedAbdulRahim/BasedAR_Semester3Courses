/*
A class which mimics an Mammal  
This class holds the methods getAnimalType, makeSound and getNumberOfMammals

*/


public class Mammal extends Animal {
	
	static int numberOfMammals=0;
	
	
	public Mammal() { // constructor 
		super(); // calls animal class constructor
		numberOfMammals++; // increases numberOfMammals by 1` 
		System.out.println("Mammal Constructor Called");
		
		
	}
	
	public Mammal(String nameOfAnimal) {
		super(nameOfAnimal);// calls animal class constructor
		numberOfMammals++; // increases numberOfMammals by 1`
		System.out.println("Mammal Constructor with name Called");
		
		
	}
	
	
	public void makeSound() { // mimics the sound of a mammal 
		System.out.println("Mammal sound");

	}
	
	public String getAnimalType() { // returns the type of animal "Mammal" 
		return "Mammal";
	}
	
	public static int getNumberOfMammals() { // returns number of different mammals 
		return numberOfMammals;
	}
	
	

	
 
}
