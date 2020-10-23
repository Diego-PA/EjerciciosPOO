/**
 * Clase que prueba el atributo estático declarado en AtributoDeClase.java
 * @author Diego Puebla Aldama.
 */
public class PruebaAtributoClase {
    public static void main(String[] args){
        //Primera impresión.
        System.out.println(AtributoDeClase.eSiguiente);
        AtributoDeClase prueba = new AtributoDeClase();
        //Segunda impresión.
        System.out.println(prueba.eSiguiente);

        AtributoDeClase prueba1 = new AtributoDeClase();
        AtributoDeClase prueba2 = new AtributoDeClase();
        AtributoDeClase prueba3 = new AtributoDeClase();

        //Incrementos
        //Valor 1
        AtributoDeClase.incremento();
        System.out.println("Desde la clase:" + AtributoDeClase.eSiguiente);
        //Valor 2
        AtributoDeClase.incremento();
        //Valor 3
        AtributoDeClase.incremento();

        //Impresiones Finales.
        System.out.println("Desde las 3 instancias:");
        System.out.println(prueba1.eSiguiente);
        System.out.println(prueba2.eSiguiente);
        System.out.println(prueba3.eSiguiente);
    }
}