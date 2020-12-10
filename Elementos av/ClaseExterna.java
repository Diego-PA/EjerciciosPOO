public class ClaseExterna{

    private int numero = 5;
    protected ClaseInterna oDeClaseInterna;

    public ClaseExterna(){
        oDeClaseInterna = new ClaseInterna();
    } 

    public void muestraTexto(){
        System.out.println(oDeClaseInterna.getTexto());
        System.out.println(oDeClaseInterna.getOtroTexto());
    }

    protected class ClaseInterna{
        private String getTexto(){
            return "Texto 1" + numero;
        }

        public String getOtroTexto(){
            return "Texto2";
        }
    }

    public static void main(String[] args){
        ClaseExterna oDeClaseExterna = new ClaseExterna();
        oDeClaseExterna.muestraTexto();
    }
}