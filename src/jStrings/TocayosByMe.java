package jStrings;

import libs.Input;

public class TocayosByMe {

	public static void main(String[] args) {
		System.out.println("Name 1:");
		String name1 = Input.get_string();	
		System.out.println("Name 2:");
		String name2 = Input.get_string();

		String[] fullName1 = name1.split(" ");

		int counter=0;
		
		for (int i=0; i<fullName1.length; i++) {
			String currentName = fullName1[i];
			if(name2.contains(currentName)) {
				counter ++;
			}
		}
		if (counter>0){
			System.out.print("Tocayo");
		}	else
			System.out.println("No tocayo");
	}
}
