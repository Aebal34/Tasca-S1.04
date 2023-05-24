package n2exercici1;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

public class StringLength extends FeatureMatcher<String, Integer>{

	public StringLength(Matcher subMatcher) {
		super(subMatcher, "given length", "length");
	}

	@Override
	protected Integer featureValueOf(String actual) {
		return actual.length();
	}
	
}
