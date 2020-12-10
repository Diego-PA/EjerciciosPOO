public class ClaseExternaConArreglo{
    
    private int arregloEnteros[];

    public ClaseExternaConArreglo(int eElementos){
        arregloEnteros = new int[eElementos];

        for(int ePos = 0; ePos < eTotal; ePos++){
            arregloEnteros[ePos] = ePos * 5;
        }


    }

    public void calcular(){
        ClaseInterna oClaseInterna = new ClaseInterna();
        System.out.println("Promedio: " + oClaseInterna.calcularPromedio());

    }

    public class ClaseInterna{

        public int calcularPromedio(){
            int eAcumulador = 0;

            for (int eNumero : arregloEnteros) {
                eAcumulador += eNumero;
            }

            return eAcumulador/arregloEnteros.length;
        }

    }

    public static void main(String[] args) {
        
        ClaseExternaConArreglo oClaseExterna = new ClaseExternaConArreglo(5);

        oClaseExterna.calcular();

    }
}