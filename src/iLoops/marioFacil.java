package iLoops;

import libs.Input;

public class marioFacil {
    public static void main(String[] args) {
        System.out.println("Altura: ");
        int altura = Input.get_int();

        while(altura <= 1){
            System.out.print("Favor de ingresar un numero mayor a 1\n");
            altura = Input.get_int();
        }

        for(int renglon = 1; renglon <= altura; renglon++){
            int espacios = altura - renglon;

            for(int i=1; i<=espacios; i++){
                System.out.print(" ");}

            for(int i=1; i<=renglon+1; i++){
                System.out.print("#");}

            System.out.println();
        }
    }
}
