import java.util.*;
import java.lang.reflect.*;

public class Reflexion {
    public static void analizarObjeto(Object objeto){
        Class oClaseObjeto;
        Field[] aAtributos;
        Method[] aMetodos;
        int eElemento;
        Object oNuevoObjeto;

        oClaseObjeto = objeto.getClass();
        System.out.println("La clase del objeto es: " + oClaseObjeto.getName());
        aAtributos = oClaseObjeto.getDeclaredFields();
        System.out.println("\n" + "ATRIBUTOS");
        for(Field atributo : aAtributos){
            System.out.println(atributo.getName());
        }
        aMetodos = oClaseObjeto.getMethods();
        System.out.println("\n" + "METODOS");

        for (Method metodo : aMetodos) {
            System.out.println(metodo.getName());
        }

    }

    public static void main(String[] args) {
        MiFecha oFecha = new MiFecha(11,1,11);
        Reflexion.analizarObjeto(oFecha);
    }
}