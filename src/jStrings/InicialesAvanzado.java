package jStrings;

import java.util.StringTokenizer;

public class InicialesAvanzado {

	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("Evelin Ramos", " ");
		int numTokens = st.countTokens();
		for (int i = 0; i<numTokens; i++) {
			String nombreActual = st.nextToken();
			System.out.print(nombreActual.charAt(0));	
		}

	}

}
