import java.util.Scanner;

public class ArregloCliente {
    
    private Cliente aClientes[] = new Cliente[10];
    public static int contadorClientes = 0;
    
    public void agregarCliente(String nombre, String rfc, String domicilio){
        aClientes[contadorClientes] = new Cliente(nombre, rfc, domicilio);
    }

    public void borrarCliente(String rfc){

        int eContador = 0;

        for(eContador = 0; eContador <= contadorClientes; eContador++){
            if(rfc == aClientes[eContador].getRfc()){
                aClientes[eContador].getDomicilio(); //Agregar a borrar
            }
        };

    }

    //Modificar Cliente
    public void modificarCliente(){

        Scanner oScanner = new Scanner(System.in);
        int eIndice;
        int eAccion;
        String sCadena;

        System.out.println("Ingrese el indice del cliente a modificar: ");
        eIndice = oScanner.nextInt();
        System.out.println("¿Que atributo desea modificar?\n1) Nombre\n2)rfc\n3)Domicilio");
        oScanner.nextInt();
        eAccion = oScanner.nextInt();

        switch (eAccion) {
            case 1:
                System.out.println("Ingrese el nuevo nombre: ");
                oScanner.nextLine();
                sCadena = oScanner.nextLine();
                aClientes[eIndice].setNombre(sCadena);
                break;

            case 2:
                System.out.println("Ingrese el nuevo rfc: ");
                oScanner.nextLine();
                sCadena = oScanner.nextLine();
                aClientes[eIndice].setRfc(sCadena);
                break;

            case 3:
                System.out.println("Ingrese el nuevo domicilio: ");
                oScanner.nextLine();
                sCadena = oScanner.nextLine();
                aClientes[eIndice].setDomicilio(sCadena);
                break;

            default:
                System.out.println("Jajajajas elige uno que exista :D");
                break;
        }
    }

    //ConsutlarCliente
    public void consultarCliente(){

        Scanner oScanner = new Scanner(System.in);
        int eIndice;

        System.out.println("Ingrese el indice del cliente a consultar: ");
        eIndice = oScanner.nextInt();

        System.out.println("aClientes[" + eIndice + "]:");
        System.out.println("Nombre: " + aClientes[eIndice].getNombre());
        System.out.println("RFC: " + aClientes[eIndice].getRfc());
        System.out.println("Domicilio: " + aClientes[eIndice].getDomicilio());

    }

    //ListarClientes for mejorado
    public void listarClientes(){

        int eContador = 0;

        for(eContador = 0; eContador <= contadorClientes; eContador++){
            aClientes[eContador].getNombre();
        };

    }
}
