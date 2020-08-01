package jStrings;

public class InicialesDificilOmar {

	public static void main(String[] args) {
		
		String nombre = " pedro     antonio     Aguinaga   ";
		String nombreCortado = nombre.trim();
		String[] nombresIndividuales = nombreCortado.split(" ");
		
		for (int i = 0; i<nombresIndividuales.length; i++) {
			String nombreActual = nombresIndividuales[i];
			if (nombreActual.length()>0) {
			char inicial = nombreActual.charAt(0);
			char inicialMayuscula = Character.toUpperCase(inicial);
			System.out.print(inicialMayuscula);
			}
		}
	}

}
