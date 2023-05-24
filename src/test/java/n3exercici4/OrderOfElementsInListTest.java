package n3exercici4;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class OrderOfElementsInListTest {

	@Test
	public void orderOfElementsInList() {
		Shelf fantasyShelf = new Shelf("Fantasy");
		Book mistborn = new Book ("Mistborn", 1, fantasyShelf);
		Book wellOfAscension = new Book("The Well of Ascension", 2, fantasyShelf);
		
		assertThat(fantasyShelf.getBooks()).containsSequence(mistborn, wellOfAscension);	
		assertThat(fantasyShelf.getBooks()).contains(mistborn, wellOfAscension);
		
		int numOfCopies = 0;
		for(Book book : fantasyShelf.getBooks()) {
			if(book.equals(wellOfAscension)) {
				numOfCopies++;
			}
		}
		assertThat(numOfCopies).isEqualTo(1);
		
		fantasyShelf.getBooks().remove(wellOfAscension);
		assertThat(fantasyShelf.getBooks()).doesNotContain(wellOfAscension);
	}

}
