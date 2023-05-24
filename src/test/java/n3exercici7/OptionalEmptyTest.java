package n3exercici7;

import static org.assertj.core.api.Assertions.*;

import java.util.Optional;

import org.junit.Test;

import n3exercici4.Shelf;

public class OptionalEmptyTest {

	@Test
	public void optionalObjectIsEmptyTest() {
		Optional<Shelf> shelf = Optional.empty();
		
		assertThat(shelf).isEmpty();
	}
}
