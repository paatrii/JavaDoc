package net.aplicacion;

// importamos la clase Scanner 
import java.util.Scanner;

/**
 * clase principa del sistema
 * <p> <a href="https://github.com">Ver proyecto en Github</a>
 * @author patri
 *
 */

// creamos una clase publica 
public class Aplicacion {
	
	/**
	 * este es el metodo principal
	 * <h2>Aplicación</h2>
	 * @param args
	 */
	public static void main(String args[]) {
		
		// escribimos la estructura de Aplicacion
		Logica miLogica = new Logica();
		miLogica.sumar();
		miLogica.restar(5, 3);
		int mult = miLogica.multiplicar(2, 4);
		System.out.println((mult));
	}

}
