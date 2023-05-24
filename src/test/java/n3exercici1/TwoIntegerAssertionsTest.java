package n3exercici1;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class TwoIntegerAssertionsTest {

	@Test
	public void tenIsEqualToTen() {
		assertThat(10).isEqualTo(10);
	}
	
	@Test
	public void tenIsNotEqualToSix() {
		assertThat(10).isNotEqualTo(6);
	}
}
