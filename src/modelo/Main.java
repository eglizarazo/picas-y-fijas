package modelo;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Juego juego = new Juego();

        int cantidadIntentos;
        int cantidadDigitos;
        boolean permiteRepetidos;
        boolean configuracionCorrecta;





        System.out.println("Ingrese la cantidad de digitos en formato numerico ");
        cantidadDigitos = sc.nextInt();
        System.out.println("Ingrese la cantidad de intentos siguiendo la siguiente regla: min: 1 y max: cantidad de digitos multiplicado por 5 ");
        cantidadIntentos = sc.nextInt();
        System.out.println("Ingrese 0 para NO permitir digitos repetidos o 1 para SI permitir digitos repetidos ");
        permiteRepetidos = sc.nextInt() == 0 ? false: true;  // si lo que lee la consola es 0 se retorna falso de lo contrario se retorna true

        configuracionCorrecta = juego.configurarJuego(cantidadDigitos, permiteRepetidos, cantidadIntentos);
        System.out.println(configuracionCorrecta);

    }
}
