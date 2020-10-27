/**
 * Programa que realiza las 4 operaciones aritméticas con dos variables enteras.
 * @author Diego Puebla Aldama
 * @version 1.0
 */
public class Operaciones {

    /**
     * Método principal
     */
    public static void main(String[] args) {
        int eNum1 = 12, eNum2 = 5;

        //Suma
        System.out.println("Suma: " + eNum1 + " + " + eNum2 + " = " + eNum1+eNum2);
        //Resta
        System.out.println("Resta: " + eNum1 + " - " + eNum2 + " = " + (eNum1-eNum2));
        //Multiplicación
        System.out.println("Multiplicación: " + eNum1 + " * " + eNum2 + " = " + eNum1*eNum2);
        //División
        System.out.println("División: " + eNum1 + " / " + eNum2 + " = " + eNum1/eNum2);
    }
}
