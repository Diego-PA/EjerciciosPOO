import java.util.Scanner;

public class AplicacionCliente {

    public static void main(String[] args) {
        
        ArregloCliente oArreglo;
        Scanner oScanner = new Scanner(System.in);
        int eIndice, eTamanio, eOpcion = 0;
        String sNombre, sRFC, sDomicilio;

        System.out.println("Aplicación de arreglo de clientes: ");
        System.out.println("Cuántos clientes será el máximo a registrar: ");
        eTamanio = oScanner.nextInt();
        oArreglo = new ArregloCliente(eTamanio);
        System.out.println("Arreglo de Clientes creado.");

        do {

            System.out.println("Menú\n1)Agregar Cliente\n2)Borrar Cliente\n3)Modificar Cliente\n4)Consultar Cliente\n5)Listar Clientes\n6)Salir");
            eOpcion = oScanner.nextInt();

            switch (eOpcion) {
                case 1:
                    System.out.println("Ingrese el nombre de la persona: ");
                    sNombre = oScanner.nextLine();
                    System.out.println("Ingrese el rfc de la persona: ");
                    sRFC = oScanner.nextLine();
                    System.out.println("Ingrese el domicilio de la persona: ");
                    sDomicilio = oScanner.nextLine();
                    oArreglo.agregarCliente(new Cliente(sNombre, sRFC, sDomicilio));
                    break;

                case 2:
                    System.out.println("Ingrese el indice del cliente: ");
                    eIndice = oScanner.nextInt();
                    oArreglo.eliminarCliente(eIndice);
                    break;

                case 3:
                    System.out.println("Ingrese el indice del cliente: ");
                    eIndice = oScanner.nextInt();
                    oArreglo.consultarCliente(eIndice);
                    break;

                case 4:

                    break;
            
                default:
                    break;
            }

        } while (eOpcion == 6);

        oScanner.close();
    }
}
