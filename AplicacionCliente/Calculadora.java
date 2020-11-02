/**
 * Calculadora que realiza las operaciones aritméticas básicas.
 * @author Diego Puebla Aldama
 * @version 1.0
 */

import java.util.Scanner;

public class Calculadora{
	
	private float fNumero1;
	private float fNumero2;
	private float fResultado;

    /**
     * Método que implementa la suma.
     * @param fNumero1 Primer número.
     * @param fNumero2 Segundo número.
     * @return Resultado de la suma.
     */
    public float Suma(float fNumero1, float fNumero2){
        
        fResultado = fNumero1 + fNumero2;
        return fResultado;

    }    

    /**
     * Método que implementa la resta.
     * @param fNumero1 Primer número.
     * @param fNumero2 Número que se le resta al otro.
     * @return Resultado.
     */
    public float Resta(float fNumero1, float fNumero2){
        
        fResultado = fNumero1 - fNumero2;
        return fResultado;

    }

    /**
     * Método que implementa la multiplicación.
     * @param fNumero1 Primer número.
     * @param fNumero2 Segundo Número.
     * @return Resultado de la multiplicación.
     */
    public float Multiplicacion(float fNumero1, float fNumero2){
        
        fResultado = fNumero1 * fNumero2;
        return fResultado;

    }

    /**
     * Método que implementa la división.
     * @param fNumero1 Dividendo.
     * @param fNumero2 Divisor.
     * @return Resultado de la división.
     */
    public float Division(float fNumero1, float fNumero2){
        
        fResultado = fNumero1 / fNumero2;
        return fResultado;

    }

    /**
     * Método principal.
     */
	public static void main(String[] args){

        Calculadora calculadora = new Calculadora();
        Scanner oScanner = new Scanner(System.in);
        int eOpcion = 0;

        do {
            System.out.println("Calculadora:\nSeleccione una operación:\n1) Suma\n2) Resta\n3) Multiplicación\n4) División\n5) Salir.");
            eOpcion = oScanner.nextInt();

            switch (eOpcion) {
                case 1:
                    System.out.println("Dame el primer numero: ");
                    calculadora.fNumero1 = oScanner.nextFloat();
                    System.out.println("Dame el segundo numero: ");
                    calculadora.fNumero2 = oScanner.nextFloat();
                    System.out.println(calculadora.Suma(calculadora.fNumero1, calculadora.fNumero2));
                    break;

                case 2:
                    System.out.println("Dame el primer numero: ");
                    calculadora.fNumero1 = oScanner.nextFloat();
                    System.out.println("Dame el segundo numero: ");
                    calculadora.fNumero2 = oScanner.nextFloat();
                    System.out.println(calculadora.Resta(calculadora.fNumero1, calculadora.fNumero2));
                    break;

                case 3:
                    System.out.println("Dame el primer numero: ");
                    calculadora.fNumero1 = oScanner.nextFloat();
                    System.out.println("Dame el segundo numero: ");
                    calculadora.fNumero2 = oScanner.nextFloat();
                    System.out.println(calculadora.Multiplicacion(calculadora.fNumero1, calculadora.fNumero2));
                    break;

                case 4:
                    System.out.println("Dame el primer numero: ");
                    calculadora.fNumero1 = oScanner.nextFloat();
                    System.out.println("Dame el segundo numero: ");
                    calculadora.fNumero2 = oScanner.nextFloat();
                    System.out.println(calculadora.Division(calculadora.fNumero1, calculadora.fNumero2));
                    break;

                case 5:
                    System.out.println("Adios.");
                    break;
            
                default:
                    System.out.println("Opción no valida.");
                    break;
            }

        } while (eOpcion != 5);

	}
	
}
