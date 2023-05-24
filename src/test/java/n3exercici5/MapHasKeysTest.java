package n3exercici5;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;
import java.util.*;


public class MapHasKeysTest {

	@Test
	public void mapHasSpecificKey() {
		
		HashMap<String, String> countries = new HashMap<String, String>();
		countries.put("Spain", "Madrid");
		countries.put("France", "Paris");
		countries.put("Germany", "Berlin");
		
		assertThat(countries).containsKey("Spain");
	}
}
