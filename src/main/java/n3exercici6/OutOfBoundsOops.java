package n3exercici6;

public class OutOfBoundsOops {

	private final String[] animals;
	
	public OutOfBoundsOops(){

		animals = new String[]{"Snake", "Lion", "Whale", "Dog", "Tucan"};
	}
	
	public String searchAnimal(int num) {
		
		return animals[num];
	}
}