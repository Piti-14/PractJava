package model;

import java.util.ArrayList;

public class NonResidentList {
	
	private static ArrayList<NonResident> nonResidents = new ArrayList<>();
	
	public static void addNonResident(NonResident v) {
		nonResidents.add(v);
	}
	
	public static ArrayList<NonResident> getNonResidentList() {
		return nonResidents;
	}
}
