package net.aplicacion;

import java.util.Scanner;

/**
 * clase principa del sistema
 * <p> <a href="https://github.com">Ver proyecto en Github</a>
 * @author patri
 *
 */

public class Aplicacion {
	
	/**
	 * este es el metodo principal
	 * <h2>Aplicación<h2>
	 * @param args
	 */
	public static void main(String args[]) {
		
		Logica miLogica = new Logica();
		miLogica.sumar();
		miLogica.restar(5, 3);
		int mult = miLogica.multiplicar(2, 4);
		System.out.println((mult));
	}

}
