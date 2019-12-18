package net.aplicacion;

import java.util.Scanner;

public class Aplicacion {
	
	public static void main(String args[]) {
		
		Logica miLogica = new Logica();
		miLogica.sumar();
		miLogica.restar(5, 3);
		int mult = miLogica.multiplicar(2, 4);
		System.out.println((mult));
	}

}
