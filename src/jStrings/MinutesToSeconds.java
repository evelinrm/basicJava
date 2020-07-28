package jStrings;


import libs.Input;

public class MinutesToSeconds {

	public static void main(String[] args) {
		System.out.print("Video duration (mm:ss): ");
		String duration = Input.get_string();
		String [] separateDuration = duration.split(":");		
		int intMin = Integer.parseInt(separateDuration[0]);
		int minutes= intMin * 60;
		int seconds = Integer.parseInt(separateDuration[1]);
		if (intMin>60) {
			System.out.println("Enter valid duration.");
		} else if (seconds>60) {
			System.out.println("Enter valid duration.");
		} else {			
			int totalOfSecs = minutes + seconds;	
			System.out.println("The video duration is: " + totalOfSecs + " seconds.");
		}
	}
}

