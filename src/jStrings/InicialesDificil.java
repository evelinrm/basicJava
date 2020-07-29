package jStrings;

import libs.Input;

public class InicialesDificil {

	public static void main(String[] args) {

				System.out.print("Name: ");		//imprimir nombre
				String name = Input.get_string(); 	//guardar nombre en variable 'name'
				
				String [] individualNames = name.split(" "); //separar el nombre por espacios			
				int longNames = individualNames.length;		//variable que guarda cantidad de palabras
				
				for(int i = 0; i<longNames; i++) {		//ciclo que corre numero de veces = numero de palabras
					char inicial = individualNames[i].charAt(0);	//sacar inicial de cada palabra
					
					if (inicial >= 'A' && inicial <= 'Z') {		//si la inicial es mayor a A y menor que Z
						System.out.print(inicial);		//imprimir iniciales sin modificar nada							
					} else {						//si no
						char [] upper = individualNames[i].toCharArray();	 //transformar arreglo String a char					
						upper[0] = Character.toUpperCase(upper[0]);			//hacer mayuscula el primer caracter
						System.out.print(upper[0]);		//imprimir primer caracter
					}					
	}
	}
}
