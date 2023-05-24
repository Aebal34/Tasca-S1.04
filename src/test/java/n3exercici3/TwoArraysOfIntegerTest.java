package n3exercici3;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class TwoArraysOfIntegerTest {

	@Test
	public void intArrayIsEqualToIntArray() {
		
		int nums1[]= {0, 1, 2, 3, 4, 5};
		int nums2[]= {0, 1, 2, 3, 4, 5};
		
		assertThat(nums1).containsExactly(nums2);
	}
}
