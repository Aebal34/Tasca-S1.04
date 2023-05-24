package n1exercici1;

import java.util.*;

public class MonthList {

	//ATTRIBUTE
	private List<String> months; 
	
	//CONSTRUCTOR
	public MonthList() {
		months = new ArrayList<String>();
		addMonthsInList();
	}
	
	//GETTERS
	public List<String> getMonths(){
		return months;
	}
	
	public void addMonthsInList() {
		months.add("Januray");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
	}
}
