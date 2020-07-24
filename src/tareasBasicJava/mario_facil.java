package tareasBasicJava;

import libs.Input;

public class mario_facil {	
	public static void main(String[] args) {
		System.out.print("Numero de altura de piramide: ");
		int nColumna = Input.get_int();
		int nEspacios = nColumna-2;
		int nGatos = nColumna-nEspacios;	
		
		for(int j=1; j<=nColumna; j++) {	
			System.out.println();
			for(int i=1; i<=nEspacios+1; i++) {	
				System.out.print(" ");
			}
			
			for(int i=1; i<=nGatos; i++) {	
				System.out.print("#");	
			}
			
			nEspacios--;
			nGatos++;
		}
	}
}
