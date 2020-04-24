package gNumericTypes;

/* Implementa un programa que reporte el uso de agua de un usuario que dura x minutos en la
        ducha expresado en botellas de agua.
        $ ./botellas_agua
        Minutos: 1
        Botellas: 12

        $ ./botellas_agua
        Minutos: 10
        Botellas: 120 */

import libs.Input;

public class botellas_agua {
    public static void main(String args[]){

        System.out.println("Cuantos minutos duras en la ducha?");
        int minutos = Input.get_int();
        int botellas = 12;
        int totalBotellas = minutos * botellas;
            System.out.println("Usted gasta " + totalBotellas + " botellas de agua");
    }
}
