package net.aplicacion;

import java.util.Scanner;

/**
 * Esta clase define unos metodos basicos 
 * de logica matematica
 * @author patri
 *
 */

public class Logica {
	
	/**
	 * metodo que permite sumar dos numeros enteros 
	 */
	
	public void sumar() {
		
		int num1=5;
		int num2=6;
		
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
	
	public int multiplicar(int num1, int num2) {
		
		return num1*num2;
	}

}
