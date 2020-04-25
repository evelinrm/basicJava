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

    //funcion terca
    public static int get_positive_int()
    {
        int n;
        do
        {
            System.out.print("n is ");
            n = Input.get_int();
        }
        while (n < 1);
        return n;
    }

    public static void main(String args[]){
        System.out.println("Cuantos minutos duras en la ducha? ");
        int minutos = get_positive_int();
        int botellas = 12;
        int totalBotellas = minutos * botellas;
            System.out.println("Usted gasta " + totalBotellas + " botellas de agua");
    }
}
