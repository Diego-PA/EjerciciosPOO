/**
 * Programa que hace uso de las clases wrapper para demostrar su funcionamiento.
 * @author Diego Puebla Aldama
 * @version 1.0
 */
public class Wrapper {

    public static void main(String[] args) {
        int entero = 15;
        Integer oEntero = new Integer(entero);
        int nuevoEntero = oEntero.intValue();

        System.out.println("Entero: " + entero);
        System.out.println("Wrapper: " + oEntero.intValue());
        System.out.println("Nuevo Entero: " + nuevoEntero);

    }

}
