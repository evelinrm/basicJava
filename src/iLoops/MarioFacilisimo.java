package iLoops;

import libs.Input;

public class MarioFacilisimo {

    public static void main(String[] args) {
        System.out.println("Altura de piramide: ");
        int nAltura = Input.get_int();
        dibujarPiramide(nAltura);
    }

    private static void dibujarPiramide(int nAltura) {
        //imprimir renglon por renglon. primer el renglon 1, luego el 2... etc gasta ek renglon altura
        for(int nRenglon=1; nRenglon<=nAltura; nRenglon++) {
        imprimirRenglon(nRenglon, nAltura);
        }
    }

    private static void imprimirRenglon(int nRenglon, int nAltura) {
        // para imprimir cada renglon, primero tengo que imprimir espacions, gatitos y salto de linea
        imprimirEspacios(nRenglon, nAltura);
        imprimirGatitos(nRenglon, nAltura);
        System.out.println();
    }

    private static void imprimirEspacios(int nRenglon, int nAltura) {
        //System.out.print("imprime espacios");
    }

    private static void imprimirGatitos(int nRenglon, int nAltura) {
        //System.out.print("imprime gatitos");
        int nGatos = nRenglon + 1;
        for(int i=0; i<nGatos; i++){
            System.out.print("#");
        }
    }

}
