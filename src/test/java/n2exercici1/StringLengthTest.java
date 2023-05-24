package n2exercici1;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

import static org.hamcrest.CoreMatchers.*;

public class StringLengthTest {

	@Test
	public void MordorIsNotEightCharsLong() {
		StringLength lengthIsNotEight = new StringLength(is(not(8)));
		assertThat("Mordor", lengthIsNotEight);
	}
	
	@Test
	public void MordorIsSixCharsLong() {
		assertThat("Mordor", length(is(6)));
	}

	public static FeatureMatcher<String, Integer> length(Matcher<? super Integer> subMatcher){
		
		return new FeatureMatcher<String,Integer>(subMatcher, "given length", "length"){
			
			@Override
			protected Integer featureValueOf(String actual) {
				return actual.length();
			}
		};
	}
}
