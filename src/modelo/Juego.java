/**
 * 
 */
package modelo;

import java.lang.Math;
import java.math.BigInteger;
import java.util.Random;

/**
 * @author Edison Lizarazo
 *
 */
public class Juego {


    private int cantidaDigitos = 1;  // Por defecto 1
    private boolean permiteDigitosRepetidos = false;   //Por defecto falso
    private int cantidadIntentos = 1; //por defecto 1

    private int picas = 0;
    private int fijas = 0;
    private BigInteger numeroParaAdivinar;
    Random r = new Random();


    public boolean configurarJuego(int cantidadDigitos, boolean permiteDigitosRepetidos, int cantidadIntentos ) {

        // Hace la asignacion a la variable correspondiente
        this.permiteDigitosRepetidos = permiteDigitosRepetidos;

        // Si la cantidad de digitos no esta en el rango esperado se muestra el error y corta el flujo
        if(cantidadDigitos < 1 || cantidadDigitos >10 ){
            System.out.println("ERROR: La cantidad de digitos debe estar entre 1 y 10");
            return false;
        }

        // Como no salto ningun error se hace la asignacion correspondiente
        this.cantidaDigitos = cantidadDigitos;

        // Si la cantidad de intentos no esta en el rango esperado se muestra el error y corta el flujo
        if(cantidadIntentos < 1 ||  cantidadIntentos > cantidadDigitos*5) {
            System.out.println("ERROR: La cantidad de intentos debe estar entre 1 y " + cantidadDigitos*5);
            return false;
        }

        // Como no salto ningun error se hace la asignacion correspondiente
        this.cantidadIntentos = cantidadIntentos;

        //Como en el flujo no salto ningun error se retorna true indicando que salio bien
        return true;
    }

    public void generarNumeroAleatorio() {

        Random r = new Random(865);
        String numberInString = "";
        for(int i = 0; i< this.cantidaDigitos; i++) {
            numberInString = numberInString + r.nextInt(9-1);
        }
        numeroParaAdivinar  = new BigInteger(numberInString);
        System.out.println("Numero para adivinar es " + this.numeroParaAdivinar);
    }

}
