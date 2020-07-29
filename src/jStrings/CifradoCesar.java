package jStrings;

import libs.Input;

public class CifradoCesar {

	public static void main(String[] args) {
		System.out.print("Original message: ");
		String oMessage = Input.get_string();
		
		int lMessage = oMessage.length();
		
		int newValue = 0;
		
		for(int i = 0; i<lMessage; i++) {
		System.out.print(oMessage.charAt(i) + " ");
		}
		System.out.println("");
		for(int i = 0; i<lMessage; i++) {
		newValue = (int)oMessage.charAt(i);
		
		if (newValue<78) {
		newValue = (int)oMessage.charAt(i) + 13;
		char newChar = (char)newValue;
		System.out.print(newChar + " ");}
		else {
			newValue = 0;
			newValue = (int)oMessage.charAt(i) + 13 - 26;
			char newChar = (char)newValue;
			System.out.print(newChar + " ");
		}
			
		}
	}

}
