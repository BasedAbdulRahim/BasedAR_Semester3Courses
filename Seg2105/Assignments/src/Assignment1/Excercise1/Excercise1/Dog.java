/*
a class which mimics a dog  
This class holds the methods getanimalType, makeSound 

*/
public class Dog extends Mammal{
	
	public Dog() { // consttuctor 
		super(); // calls mammal class 
		System.out.println("Dog Constructor Called");
	}

	
	public Dog(String nameOfAnimal) {
		super(nameOfAnimal);// constructor calling mammal class 
		System.out.println("Mammal Constructor with name Called");
		
		
	}
	
	public void makeSound() { // mimics the sound of a dog 
		System.out.println("Dog sound");

	}
	
	public String getAnimalType() { // returns the type of mammal "dog" 
		return "Dog";
	}
	
	
}
