package jStrings;

import libs.Input;

public class inicialesDificilBienHecho {

	public static void main(String[] args) {
		Input.print("Nombre: ");
		String name = Input.get_string();
		String namec = name.trim().replaceAll("\\s+", " ");
		
		String [] names = namec.split(" ");
		
		String result = extraer(name, names);
		Input.print(result);
	}

	private static String extraer(String name, String [] names) {
		String result = "";
		
		for(int i = 0; i<names.length; i++) {
			
			char actual = names[i].charAt(0);
			char actualMayusc = Character.toUpperCase(actual);
				result = result + actualMayusc;
			
		}
		
		return result;
	}

}
