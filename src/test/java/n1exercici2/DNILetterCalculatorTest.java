package n1exercici2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class DNILetterCalculatorTest {

	@Test
	public void thisNumberShouldBeT() {
		DNILetterCalculator c = new DNILetterCalculator();
		
		assertEquals('T', c.getLetterFromDNI("25637801"));
	}
	
	public void thisNumberIsNotEightCharactersLon() {
		DNILetterCalculator c = new DNILetterCalculator();
		
		assertEquals('#', c.getLetterFromDNI("55"));
	}

	public void thisNumberShouldBeJ() {
		DNILetterCalculator c = new DNILetterCalculator();
		
		assertEquals('J', c.getLetterFromDNI("96651119"));
	}
	
	public void thisNumberShouldBeS() {
		DNILetterCalculator c = new DNILetterCalculator();
		
		assertEquals('S', c.getLetterFromDNI("32685407"));
	}
	
	public void thisNumberShouldBeC() {
		DNILetterCalculator c = new DNILetterCalculator();
		
		assertEquals('C', c.getLetterFromDNI("84039904"));
	}
	
	public void thisNumberShouldBeH() {
		DNILetterCalculator c = new DNILetterCalculator();
		
		assertEquals('H', c.getLetterFromDNI("82299998"));
	}
	
	public void thisNumberShouldBeV() {
		DNILetterCalculator c = new DNILetterCalculator();
		
		assertEquals('V', c.getLetterFromDNI("92154255"));
	}
	
	public void thisNumberShouldBeB() {
		DNILetterCalculator c = new DNILetterCalculator();
		
		assertEquals('B', c.getLetterFromDNI("07247380"));
	}
	
	public void thisNumberShouldBeX() {
		DNILetterCalculator c = new DNILetterCalculator();
		
		assertEquals('X', c.getLetterFromDNI("03085161"));
	}
	
	public void thisNumberShouldBeY() {
		DNILetterCalculator c = new DNILetterCalculator();
		
		assertEquals('Y', c.getLetterFromDNI("25304330Y"));
	}
}