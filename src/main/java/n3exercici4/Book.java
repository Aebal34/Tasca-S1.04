package n3exercici4;

public class Book {

	//ATTRIBUTES
	private String name;
	private int num;
	private Shelf shelf;
	
	//CONSTRUCTOR
	public Book(String name, int num, Shelf shelf) {
		
		this.name = name;
		this.num = num;
		this.shelf=shelf;
		shelf.getBooks().add(this);
	}
	
	//GETTERS
	public String getName() {
		return name;
	}
	public Integer getNum() {
		return num;
	}
	public Shelf getShelf() {
		return shelf;
	}
}
