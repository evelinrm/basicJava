package jStrings;

public class CifradoCesarMejorado{

	public static void main(String[] args) {
		String msg = "CoDiFiCa";
		
		for(int i = 0; i<msg.length(); i++) {
			
			char actual = msg.charAt(i);
			char encriptado = (char)(actual + 5);
			if (encriptado>90 && encriptado<96 ) { 	//mayusc
				char nuevoEncriptado = (char)(encriptado - 26);
				System.out.print(nuevoEncriptado);
				
			} else if(encriptado>122){ 			//minusc
				char nuevoEncriptado = (char)(encriptado - 26);
				System.out.print(nuevoEncriptado);
			} else {
				System.out.print(encriptado);
			}
			
		}

	}

}
