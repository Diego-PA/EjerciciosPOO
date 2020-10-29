import java.util.Scanner;

public class AplicacionCliente {

    public static void main(String[] args) {
        
        ArregloCliente aClientes = new ArregloCliente();
        Scanner oScanner = new Scanner(System.in);
        int eOpcion = 0;
        String sNombre, sRFC, sDomicilio;

        while (eOpcion != 6) {
            
            System.out.println("Aplicación Cliente: ");
            System.out.println("¡Hola! ¿Que deseas hacer hoy?\n1)Agregar Cliente\n2)Borrar Cliente\n3)Modificar Cliente\n4)Consultar Cliente\n5)Listar Clientes\n6)Salir");
            eOpcion = oScanner.nextInt();

            switch (eOpcion) {
                case 1:
                    System.out.println("Nombre: ");
                    oScanner.nextLine();
                    sNombre = oScanner.nextLine();
                    System.out.println("RFC: ");
                    oScanner.nextLine();
                    sRFC = oScanner.nextLine();
                    System.out.println("DOMICILIO: ");
                    oScanner.nextLine();
                    sDomicilio = oScanner.nextLine();
                    aClientes.agregarCliente(sNombre, sRFC, sDomicilio);
                    break;

                case 2:
                    System.out.println("RFC: ");
                    //oScanner.nextLine();
                    sRFC = oScanner.nextLine();
                    aClientes.borrarCliente(sRFC);
                    break;

                case 3:
                    aClientes.modificarCliente();
                    break;

                case 4:
                    aClientes.consultarCliente();
                    break;

                case 5:
                    aClientes.listarClientes();
                    break;

                case 6:
                    System.out.println("Hasta luego!");
                    break;

                default:
                    System.out.println("Jajajajas elige una opción que exista :D");
                    break;
            }

        }
        oScanner.close();
    }
}
