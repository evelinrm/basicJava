package jStrings;

import libs.Input;

public class MadurezLectora {

	public static void main(String[] args) {
		
		//Pedir Texto
		System.out.println("Ingresa texto: ");
		String texto = Input.get_string();
				
		//Encontrar L ; L = Letras / palabras * 100
 		String[] palabras = texto.split(" ");	//separar palabras en un arreglo
		int longPalabras = palabras.length; 	//calcular total de palabras en el arreglo
		System.out.println("\nCant de palabras: " + longPalabras); //imprime cantidad de palabras en el arreglo
		
		int sumLetras = 0;	//suma
		
		for(int i=0; i<longPalabras; i++) { 	//el ciclo se corre el numero de palabras que tiene el texto
			int cantLetras = palabras[i].length(); 		//saca la cantidad de letras que tiene cada palabra
			sumLetras+=cantLetras; 		// suma de las letras en total del texto, sin contar espacios
		}
		
		System.out.println("Suma de letras: " + sumLetras);		//imprime suma de las letras en total del texto, sin contar espacios
		
		String[] oraciones = texto.split("\\.");
		int numOraciones = oraciones.length;
		double L = ((double)(sumLetras)/(double)(longPalabras))*(100);
		System.out.println("L es:  " + L);
		
		//Encontrar O	
		System.out.println("Numero de oraciones: " + numOraciones);
		double O = ((double)numOraciones/(double)(longPalabras))*(100);
		System.out.println("O es: " + O);
		
		//Grado = 0.0588 * L - 0.296 * O -15.8
		double grado = ((0.0588 * L) - (0.296 * O)) - 15.8;
		System.out.println("El grado es: " + (int)grado );
	}

}
