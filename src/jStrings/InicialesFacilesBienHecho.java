
package jStrings;

import libs.Input;

public class InicialesFacilesBienHecho {
	
	public static void main(String[] args) {
		Input.print("Nombre: ");
		String name = Input.get_string();
		
		String result = extraer(name);
		Input.print(result);
	}

	private static String extraer(String name) {
		
		String result = "";
		
		for(int i = 0; i<name.length(); i++) {
			
			if(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
				result = result + name.charAt(i);
			}
		}
		
		return result;
	}

}
