package n1exercici2;

import java.util.*;

public class DNILetterCalculator {

	//ATTRIBUTES
	final private int moduleDNI = 23;
	
	final private ArrayList<Character> letterDNI = new ArrayList<Character>(Arrays.asList(
	'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
	'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'));
	
	//CONSTRUCTOR
	
	public DNILetterCalculator() {
		
	}

	//METHODS

	public char getLetterFromDNI(int num) {	
		
		Character letter = '#';
		letter = letterDNI.get((num%moduleDNI));
		
		return letter;
	}
}