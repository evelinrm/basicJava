package mArrays;

import libs.Input;

public class RemoverCharacter {

	public static void main(String[] args) {
		
		Input.print("Cadena: ");
		String s = Input.get_string();
		String sSinEspacios = s.trim();
		Input.print("Character to be removed: ");
		char c = Input.get_char();
		
		String finalResult = strip(sSinEspacios,c);
		System.out.println(finalResult);
	}

	private static String strip(String sSinEspacios, char c) {
		
		String result = "";
		
		for(int i = 0; i<sSinEspacios.length(); i++) {
			char actual = sSinEspacios.charAt(i);
			if (actual!=c) {
				result = result + actual;
			}			
		}	
		return result;
	}

}
