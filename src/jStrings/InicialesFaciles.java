package jStrings;

import libs.Input;

public class InicialesFaciles {

	public static void main(String[] args) {
		System.out.print("Name: ");
		String name = Input.get_string();
		
		String [] individualNames = name.split(" ");
		int longNames = individualNames.length;
		
		for(int i = 0; i<longNames; i++) {
			char inicial = individualNames[i].charAt(0);
			System.out.print(inicial);
	}
	}
}
