package jStrings;

import libs.Input;

public class ClaseMadurezLectora {
	
	//vars
	private String texto;
	
	//behavior
	public void pedirTexto() {
		System.out.println("Texto: ");
		texto = Input.get_string();
	}
	
	public void calcularResultado() {
	//Encontrar numero de Palabras
		String[] palabras = texto.split(" ");
		int nPalabras = palabras.length;
		System.out.println("numero de palabras: " + nPalabras);
	//Encontrar numero de letras
		int letras = 0;
		for(int i=0; i<nPalabras; i++) {
			letras += palabras[i].length();
		}
		System.out.println("cantidad de letras: " + letras);
		//Encontrar numero de Oraciones
		String[] oraciones = texto.split("\\.");
		int nOraciones = oraciones.length;
		System.out.println("numero de oraciones: " + nOraciones);
		//Encontrar L
		double L = (100 * letras) / nPalabras;
		//Encontrar O
		double O = (100 * nOraciones) / nPalabras;
		//Encontrar indice: 
		int indice = (int)((.0588 * L) - .296 * (O - 15.8));
		System.out.println("Indice: " + indice);
		//Encontrar grado dependiendo del indice
		if(indice>=1 && indice <=6) {
			System.out.println("Grado: "+ indice +" Primaria");
		} else if(indice>=7 && indice <=9) {
			indice = indice-6;
			System.out.println("Grado: "+ indice + " Secundaria");
		} else if(indice>= 10 && indice<=12) {
			indice = indice-9;
			System.out.println("Grado: "+indice +" Prepa");
		} else {
			System.out.println("universitario");
		}
		
	}
	
	
}
