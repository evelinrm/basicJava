package tareasBasicJava;

import libs.Input;

public class botellas_agua {

	public static void main(String[] args) {
		System.out.println("¿Cuantos minutos duras en la ducha?: ");
		int min = Input.get_int();
		int botellas = min * 12;
		System.out.println("\nGastas " + botellas + " botellas de agua al ducharte");
	}

}
