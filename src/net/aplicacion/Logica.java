package net.aplicacion;

//importamos la clase Scanner
import java.util.Scanner;


/**
 * Esta clase define unos metodos basicos 
 * de logica matematica
 *  <p> <a href="https://github.com">Ver proyecto en Github</a>
 * @version 1.0
 * @since 0.3
 * @see Aplicacion
 * @author patri
 *
 */

//creamos una clase publica 
public class Logica {
	
	/**
	 * metodo que permite sumar dos numeros enteros 
	 * <h2>Lógica</h2>
	 */
	
	public void sumar() {
		
		//introducimos las variables 
		int num1=5;
		int num2=6;
		
		// utilizamos syso para que nos muestre el resultado en pantalla 
		System.out.println((num1+num2));

	}
	/**
	 * este metodo nos permite restar dos numeros enteros
	 * @param num1 valor ingresado por el usuario
	 * @param num2 valor ingresado por el usuario
	 */
	
	public void restar(int num1, int num2) {
		
		System.out.println((num1-num2));
	}
	/**
	 * este metodo permite multiplicar dos numeros enteros
	 * @param num1
	 * @param num2
	 * @return retorna un valor entero con el resultado de la operacion 
	 */
	
	public int multiplicar(int num1, int num2) {
		
		return num1*num2;
	}

}
