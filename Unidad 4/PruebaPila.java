import java.util.Scanner;

public class PruebaPila {
    public static void main(String[] args) {
        
        int eTamanio, eOpcion;
        PilaEstatica oPila;
        String sNombre, sApellido;
        Nodo oNodo;
        Scanner oScanner = new Scanner(System.in);

        System.out.println("¿Cuál es el tamaño de la pila?");
        eTamanio = oScanner.nextInt();
        oPila = new PilaEstatica(eTamanio);

        do {
            System.out.println("Programa que prueba una pila estática.");
            System.out.println("1)Insertar\n2)Extraer\n3)Salir\nIngres una opción: ");
            eOpcion = oScanner.nextInt();

            switch(eOpcion){

                case 1:
                System.out.println("Ingrese el nombre de la persona: ");
                sNombre = oScanner.nextLine();
                System.out.println("Ingrese el apellido de la persona: ");
                sApellido = oScanner.nextLine();
                //oNodo = new Nodo(sNombre, sApellido);
                oPila.push(new Nodo(sNombre, sApellido));
                break;

                case 2:
                    System.out.println(oPila.pop());
                    break;
                
                case 3:
                    System.out.println("Hasta luego.");
                    break;

                default:
                    System.out.println("Elige una opción que exista jsjsjs");

            }

        } while (eOpcion == 3);
    }
}
