import javax.print.event.PrintJobListener;

/**
 * Programa que declara una variable flotante, le asigna un valor y lo muestra y luego le asigna un entero y lo muestra.
 * @author Diego Puebla Aldama
 * @version 1.0
 */
 
public class FlotanteEntero {

    /**
     * Método principal
     */
    public static void main(String[] args) {
        
        float fVariable = 15.25f;
        int iVariable = (int)fVariable;

        System.out.println("fVariable = " + fVariable);
        System.out.println("iVariable = " + iVariable);

        
    }
}