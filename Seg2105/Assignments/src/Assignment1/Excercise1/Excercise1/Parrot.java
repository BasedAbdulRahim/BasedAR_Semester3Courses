
/*
a class which mimics a parrot  
This class holds the methods getanimalType, makeSound 

*/

public class Parrot  extends Bird{
	
	public Parrot () { // constructor 
		super(); // calls on bird class constructor 
		System.out.println("Parrot  Constructor Called");
		
		
	}
	
	public Parrot (String nameOfAnimal) { // constructor with parameter 
		super(nameOfAnimal);// calls on bird class construct with parameter
		
		System.out.println("Parrot  Constructor with name Called");
		
		
	}
	
	public void makeSound() { // mimics the sound of a parrot
		System.out.println("Parrot sound");

	}
	
	public String getAnimalType() { // returns the type of bird "Parrot" 
		return "Parrot ";
	}

}
