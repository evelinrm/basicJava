package jStrings;

import libs.Input;

public class segundosReproduccionDificil {

	public static void main(String[] args) {
		
		System.out.println("Segundos de duración de la canción: ");
		int segundos = Input.get_int();
		if (segundos>60) {
			int segundos2 = segundos%60;	
			int minutos = segundos/60;
			System.out.println("La canción dura " + minutos + " minutos y " + segundos2 + " segundos.");	
		}else if (segundos!=1) {
			System.out.println("La canción dura 0 minutos y " + segundos + " segundos");
		} else {
			System.out.println("La canción dura 0 minutos y " + segundos + " segundo");
		}
	}

}
