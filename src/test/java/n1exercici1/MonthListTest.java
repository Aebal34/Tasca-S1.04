package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;


public class MonthListTest {

	//Verify the list has 12 positions
	@Test
	public void listHasTwelvePositions() {
		MonthList monthlist = new MonthList();
		assertEquals(12, monthlist.getMonths().size());
	}
	//Verify the list is not null
	@Test
	public void listIsNotNull() {
		MonthList monthlist = new MonthList();
		assertNotNull(monthlist.getMonths().size());
	}
	//Verify August is in 8th position (index 7)
	@Test
	public void augustIsInPositionEight() {
		MonthList monthlist = new MonthList();
		assertEquals("August", monthlist.getMonths().get(7));
	}
}