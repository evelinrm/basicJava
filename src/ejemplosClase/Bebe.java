package ejemplosClase;

import libs.Input;

public class Bebe {

    public static void main(String[] args) {

        System.out.println("Nombre: ");
        String nombre = Input.get_string();
        System.out.println("Peso: ");
        double peso = Input.get_double();
        System.out.println("Numero de pañales por dia: ");
        int numeroPanales = Input.get_int();
        System.out.println("Altura(cm): ");
        double altura = Input.get_double();
        System.out.println("Edad(meses): ");
        int edad = Input.get_int();
        System.out.println("Sexo: ");
        String sexo = Input.get_string();

        System.out.println(nombre + "con el peso de " + peso + "usa " + numeroPanales + " por dìa, tiene una altura de "
                + altura + "cm, su edad es de " + edad + " meses y su sexo es " + sexo);
    }

    public void comer() {

    }

    public void llorar() {

    }

    public void gatear() {

    }

    public void hacerPopo() {

    }

}


