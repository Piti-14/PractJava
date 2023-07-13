package test;

import java.util.Date;

import view.MainFrame;

public class Pruebas {
	
	public static void main(String[] args) {
		
		MainFrame mf = new MainFrame();
		
		Date ahora = new Date();
		Date antes = new Date(0);
		System.out.println(antes.getTime());
		System.out.println(ahora.getTime());
	}
}