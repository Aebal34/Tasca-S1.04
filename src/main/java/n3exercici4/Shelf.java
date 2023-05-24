package n3exercici4;

import java.util.ArrayList;

public class Shelf {

	//ATTRIBUTES
	private String genere;
	private ArrayList<Book> books;
	
	//CONSTRUCTOR
	public Shelf(String genere) {
		
		this.genere=genere;
		books=new ArrayList<Book>();
	}
	
	//GETTERS
	public String getGenere() {
		return genere;
	}
	public ArrayList<Book> getBooks(){
		return books;
	}
}
