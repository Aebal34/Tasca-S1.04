package n3exercici2;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class PersonTest {

	@Test
	public void personOneIsPersonTwo() {
		Person p1 = new Person("Juan", 28);
		Person p2 = p1;
		assertThat(p1).isSameAs(p2);
	}

	@Test
	public void personOneIsNotPersonTwo() {
		Person p1 = new Person("Juan", 28);
		Person p2 = new Person("Alicia", 32);
		assertThat(p1).isNotSameAs(p2);
	}
	
}
