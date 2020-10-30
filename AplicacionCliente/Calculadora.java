/**
 * Calculadora es un programa que realiza cuatro 
 * operaciones aritméticas a partir de 2 números 
 * que son flotantes.
 * @author Pamela Stephanie Moreno Parker
 * @version 1.0
 */

import java.util.Scanner;

public class Calculadora{
	
    /**
     * Variable que almacena un primer número de tipo flotante.
     */
	public float fNumero1;
	/**
     * Variable que almacena un segundo número de tipo flotante.
     */
	public float fNumero2;
	/**
     * Variable que almacena el valor del resultado de
     * las operaciones aritméticas.
     */
	public float fResultado;

	/**
     * Suma es un método que sirve para realizar la operación Sumar
     * el valor de fNumero1 más el valor de
     * fNumero2.
	 * @return fResultado Resultado de la Suma.
     */
    public float Suma(float fNumero1, float fNumero2){
        
        fResultado = fNumero1 + fNumero2;
        return fResultado;

    }    

    /**
     * Resta es un método que sirve para realizar la operación Resta
     * el valor de fNumero1 menos el valor de
     * fNumero2.
	 * @return fResultado Resultado de la Resta.
     */
    public float Resta(float fNumero1, float fNumero2){
        
        fResultado = fNumero1 - fNumero2;
        return fResultado;

    }

    /**
     * Multiplicar es un método que sirve para realizar la operación Multiplicar
     * el valor de fNumero1 por el valor de
     * fNumero2.
	 * @return fResultado Resultado de la Multiplicación.
     */
    public float Multiplicacion(float fNumero1, float fNumero2){
        
        fResultado = fNumero1 * fNumero2;
        return fResultado;

    }

    /**
     * Division es un método que sirve para realizar la operación dividir
     * el valor de fNumero1 entre el valor de
     * fNumero2.
	 * @return fResultado Resultado de la División.
     */
    public float Division(float fNumero1, float fNumero2){
        
        fResultado = fNumero1 / fNumero2;
        return fResultado;

    }

	public static void main(String[] args){

		Calculadora Operacion1 = new Calculadora();

        Scanner oLector = new Scanner(System.in);

        System.out.println("Dame un numero: ");
        Operacion1.fNumero1 = oLector.nextFloat();

        System.out.println("\nDame otro numero: ");
        Operacion1.fNumero2 = oLector.nextFloat();
		
		System.out.println("\nSuma = " + Operacion1.Suma(Operacion1.fNumero1, Operacion1.fNumero2));
		System.out.println("\nResta = " + Operacion1.Resta(Operacion1.fNumero1, Operacion1.fNumero2));
		System.out.println("\nMultiplicacion = " + Operacion1.Multiplicacion(Operacion1.fNumero1, Operacion1.fNumero2));
		System.out.println("\nDivision = " + Operacion1.Division(Operacion1.fNumero1, Operacion1.fNumero2));

	}
	
}
