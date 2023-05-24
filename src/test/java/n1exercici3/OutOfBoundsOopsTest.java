package n1exercici3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class OutOfBoundsOopsTest {

	@Test
	public void indexSixThrowsArrayIndexOutOfBoundsException() {
		OutOfBoundsOops o = new OutOfBoundsOops();
		boolean thrown = false;
		try{
			o.searchAnimal(6);
		}catch(ArrayIndexOutOfBoundsException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
}