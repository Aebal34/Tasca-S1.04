package n3exercici6;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class OutOfBoundsOopsTest {

	@Test
	public void test() {
		OutOfBoundsOops o = new OutOfBoundsOops();
		boolean thrown = false;
		
		try{
			o.searchAnimal(10);
		}catch(ArrayIndexOutOfBoundsException e) {
			thrown = true;
			assertThat(thrown).isTrue();
		}
	}

}
