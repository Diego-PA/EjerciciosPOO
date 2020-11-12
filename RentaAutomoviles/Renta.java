import java.util.Scanner;
/**
 * Esta es la clase principal y en ella se manejan las rentas de automoviles hechas por clientes.
 * @author Puebla Aldama Diego
 */
public class Renta {

    private int maxKilometros;
    private int kilometrosActuales = 0;
    private int idCliente;
    private int idAuto;

    public Renta() {

    }

    /**
     * Constructor de la clase renta, notese que kilometrosActuales inicia en 0 por defecto.
     * @param maxKM Hace referencia a los kilometros máximos que se establecen en el contrato.
     */
    public Renta(int maxKM){
        this.maxKilometros = maxKM;
    }

    /**
     * Método que imprime en pantalla los atributos del objeto.
     */
    public void imprimirRenta(){
        System.out.println("Max KM: " + maxKilometros + "\nKM Actuales: " + kilometrosActuales);
    }

    /**
     * Método principal o main.
     */
    public static void main(String[]args){

        int eOpcion;
        Cliente cliente1 = new Cliente();
        Automovil auto1 = new Automovil();
        Renta renta1 = new Renta();
        Scanner oScanner = new Scanner(System.in);

        System.out.println("Programa que registra una renta y la muestra.");

        do {
            System.out.println("Ingrese una opción:\n1)Registrar Auto\n2)RegistrarCliente\n2)RegistrarRenta");
            eOpcion = oScanner.nextInt();

            switch (eOpcion) {
                case 1:
                System.out.println("Ingrese el ID del automovil: ");
                auto1.setID(oScanner.nextInt());

                System.out.println("Ingrese la marca del automovil: ");
                auto1.setMarca(oScanner.nextLine());

                System.out.println("Ingrese el modelo del automovil: ");
                auto1.setID(oScanner.nextLine());
                    break;

                case 2:
                    System.out.println("Ingrese el ID del cliente: ");
                    cliente1.setID(oScanner.nextInt());

                    System.out.println("Ingrese el nombre del cliente: ");
                    cliente1.setNombre(oScanner.nextLine());
                    break;

                case 3:
                    System.out.println("Ingrese el número máximo de KM: ");
                    renta1.setMaxKm(oScanner.nextInt());

                    System.out.println("Ingrese los KM actuales del automovil: ");
                    auto1.setKmAct(oScanner.nextInt());

                    System.out.println("Ingrese el ID del cliente: ");
                    auto1.setIdCliente(oScanner.nextInt());

                    System.out.println("Ingrese  del automovil: ");
                    auto1.setKmAct(oScanner.nextLine());
                    break;
            
                default:
                    break;
            }
        } while (eOpcion != 5);

        //Inicio del reporte de renta.
        System.out.println("Reporte de Renta:\nRenta 1:");
        cliente1.imprimirCliente();
        auto1.imprimirAuto();
        renta1.imprimirRenta();
    }

}