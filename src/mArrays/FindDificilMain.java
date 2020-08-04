package mArrays;

import libs.Input;

public class FindDificilMain {

	public static void main(String[] args) {
		int nums[] = {7, 4, 3, 1, 2, 9, 10};
		
		FindDificil o = new FindDificil();
		o.ordenarBurbuja(nums);
		for(int i=0; i<nums.length; i++) {
			Input.print(nums[i] + " " );
		}
		
		System.out.print("\n\nCual es el numero a encontrar: ");
		int elementoABuscar = Input.get_int();
		int posicion = elementoABuscar;
		o.BusquedaBinaria(nums, posicion, elementoABuscar);
	}

}
