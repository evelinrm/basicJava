package mArrays;

import libs.Input;

public class RemoverCharacter {

	public static void main(String[] args) {
		
		Input.print("Cadena: ");
		String s = Input.get_string();
		String sWS = s.trim();
		Input.print("Character to be removed: ");
		char c = Input.get_char();
		
		String finalResult = strip(sWS,c);
		System.out.println(finalResult);
	}

	private static String strip(String sWS, char c) {
		
		String result = "";
		
		for(int i = 0; i<sWS.length(); i++) {
			char actual = sWS.charAt(i);
			if (actual!=c) {
				result = result + actual;
			}			
		}	
		return result;
	}

}
