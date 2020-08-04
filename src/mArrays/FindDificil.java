package mArrays;

import java.util.Arrays;

import libs.Input;

public class FindDificil {	
		public void ordenarBurbuja (int [] nums) {
		int aux;
		boolean cambios = false;
				
		while(true) { //Metodo burbuja
			cambios=false;
			
			for(int i=1;i<nums.length; i++) {
				if(nums[i]<nums[i-1]) {
					aux = nums[i];
					nums[i] = nums[i-1];
					nums[i-1] = aux;
					cambios = true;
				}
			}
			if(cambios==false) 
				break;	
		}	
		}
		
		public void BusquedaBinaria(int [] nums, int posicion, int elementoABuscar) {
			//Arrays.sort(nums);
			posicion = Arrays.binarySearch(nums, elementoABuscar);
			System.out.println("\nEl elemento se encuentra en la posicion: " + posicion);
			
		}
		
}
