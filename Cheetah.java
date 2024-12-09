package inheretance;

public class Cheetah extends Animal {
	
	@Override
	public void move() {
		System.out.println("Cheetah is Running");
	}
	
	public static void main(String [] args) {
		
		 Animal animal = new Animal();
	        animal.move();
	        
	     Cheetah ch=new Cheetah();
	     ch.move();
	}

}
