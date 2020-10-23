/**
 * Clase que define un arreglo de 5 fehcas y muestra su contenido.
 * @author Puebla Aldama Diego.
 */
public class ArregloFechas {
    public static void main(String[] args) {
        MiFecha aFechas[] = new MiFecha[5];
        aFechas[0] = new MiFecha(1,1,2000);
        aFechas[1] = new MiFecha(1,1,2001);
        aFechas[2] = new MiFecha(1,1,2002);
        aFechas[3] = new MiFecha(1,1,2003);
        aFechas[4] = new MiFecha(1,1,2004);

        aFechas[0].escribir();
        aFechas[1].escribir();
        aFechas[2].escribir();
        aFechas[3].escribir();
        aFechas[4].escribir();
    }
}