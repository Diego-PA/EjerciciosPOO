public class PruebaAtributoClase {
    public static void main(String[] args){
        System.out.println(AtributoDeClase.eSiguiente);
        AtributoDeClase prueba = new AtributoDeClase();
        System.out.println(prueba.eSiguiente);

        //tener 3 objetos y que cada uno muestre los valores del siguiente.
        AtributoDeClase prueba1 = new AtributoDeClase();
        AtributoDeClase prueba2 = new AtributoDeClase();
        AtributoDeClase prueba3 = new AtributoDeClase();

        prueba1.incremento();
        prueba2.incremento();
        prueba3.incremento();

        System.out.println(prueba1.eSiguiente);
        System.out.println(prueba2.eSiguiente);
        System.out.println(prueba3.eSiguiente);
    }
}