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
	
	public boolean itHasEightNumbers(int num) {
		
		boolean result = false; 

		if(((int)(Math.log10(num)+1)) == 8) {
			result = true;
		}
		return result;
	}
	
	public int fromStringToInt(String strNum) {
		
		while(strNum.charAt(0)=='0') {
			strNum.substring(0);
		}
		return Integer.parseInt(strNum);
		
	}

	public char getLetterFromDNI(String strNum) {	
		
		int num = fromStringToInt(strNum);
		Character letter = '#';
		if(itHasEightNumbers(num)) {
			letter = letterDNI.get((num%moduleDNI));
		}
		
		return letter;
	}
}