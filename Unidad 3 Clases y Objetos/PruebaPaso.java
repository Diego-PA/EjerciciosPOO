public class PruebaPaso {
    //Cambiar los valores de los p
    public static void cambiaEntero(int eValor){
        eValor = 55;
    }
    
    public static void cambiaRefObjeto(MiFecha oFecha){
        oFecha = new MiFecha(1, 1, 2019);
    }

    public static void cambiaAtributoObjeto(MiFecha oFecha){
        oFecha.setDia(4);
    }

    public static void main(String[] args){

        MiFecha oFecha;
        int eVal;
        eVal = 11;
        cambiaEntero(eVal);
        System.out.println("El valor del entero es: " + eVal);
        oFecha = new MiFecha(22,7,2019);
        cambiaRefObjeto(oFecha);
        oFecha.escribir();
        cambiaAtributoObjeto(oFecha);
        oFecha.escribir();
    }
}