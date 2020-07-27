package tareasBasicJava;

import libs.Input;

public class Mario_Dificil_Funciones {

	public static void main(String[] args) {
		
		System.out.print("Numero de altura de piramides: ");
		int nColumna = Input.get_int();
		int nEspacios = nColumna-1;
		int nGatos = nColumna-nEspacios;
		
		
		for(int j=1; j<=nColumna; j++) {	
			System.out.println();
			
			imprimirEspacios1(nEspacios);
			imprimirGatitos1(nGatos);
						
			nEspacios--;
			nGatos++;
			
			System.out.print("	");
			
			imprimirGatitos2(nGatos);

		}
	}


	private static void imprimirGatitos2(int nGatos) {
		for(int i=1; i<=nGatos-1; i++) {	
			System.out.print("#");	
		}
		
	}

	private static void imprimirGatitos1(int nGatos) {
		for(int i=1; i<=nGatos; i++) {	
			System.out.print("#");	
		}
				
	}

	private static void imprimirEspacios1(int nEspacios) {
		for(int i=1; i<=nEspacios+1; i++) {	
			System.out.print(" ");
		}		
	}

}
