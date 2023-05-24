package n1exercici2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class DNILetterCalculatorTest {

	@Test
	public void thisNumberShouldBeT() {
		DNILetterCalculator c = new DNILetterCalculator();
		
		assertEquals('T', c.getLetterFromDNI(25637801));
	}
	@Test
	public void thisNumberShouldBeW() {
		DNILetterCalculator c = new DNILetterCalculator();
		
		assertEquals('W', c.getLetterFromDNI(69167327));
	}
	@Test
	public void thisNumberShouldBeJ() {
		DNILetterCalculator c = new DNILetterCalculator();
		
		assertEquals('J', c.getLetterFromDNI(96651119));
	}
	@Test
	public void thisNumberShouldBeS() {
		DNILetterCalculator c = new DNILetterCalculator();
		
		assertEquals('S', c.getLetterFromDNI(32685407));
	}
	@Test
	public void thisNumberShouldBeC() {
		DNILetterCalculator c = new DNILetterCalculator();
		
		assertEquals('C', c.getLetterFromDNI(84039904));
	}
	@Test
	public void thisNumberShouldBeH() {
		DNILetterCalculator c = new DNILetterCalculator();
		
		assertEquals('H', c.getLetterFromDNI(82299998));
	}
	@Test
	public void thisNumberShouldBeV() {
		DNILetterCalculator c = new DNILetterCalculator();
		
		assertEquals('V', c.getLetterFromDNI(92154255));
	}
	@Test
	public void thisNumberShouldBeB() {
		DNILetterCalculator c = new DNILetterCalculator();
		
		assertEquals('B', c.getLetterFromDNI(26223691));
	}
	@Test
	public void thisNumberShouldBeX() {
		DNILetterCalculator c = new DNILetterCalculator();
		
		assertEquals('X', c.getLetterFromDNI(41737420));
	}
	@Test
	public void thisNumberShouldBeY() {
		DNILetterCalculator c = new DNILetterCalculator();
		
		assertEquals('Y', c.getLetterFromDNI(25304330));
	}
}