package inheretance;

public class AnimalCat extends Animal {
	
	public void  makeSound() {
		System.out.println("Bark");
		
	}
	
	public static void main(String [] args) {
		Animal a= new AnimalCat();
		a.makeSound();
		
	
	}

}
